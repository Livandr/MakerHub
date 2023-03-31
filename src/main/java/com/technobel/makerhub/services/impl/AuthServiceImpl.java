package com.technobel.makerhub.services.impl;

import com.technobel.makerhub.config.security.JwtProvider;
import com.technobel.makerhub.exceptions.InvalidRefreshTokenException;
import com.technobel.makerhub.models.dto.AuthDTO;
import com.technobel.makerhub.models.entity.AuthUserRegister;
import com.technobel.makerhub.models.entity.users.User;
import com.technobel.makerhub.models.form.AuthUserRegisterForm;
import com.technobel.makerhub.models.form.LoginForm;
import com.technobel.makerhub.repository.AuthUserRegisterRepository;
import com.technobel.makerhub.repository.AuthUserRepository;
import com.technobel.makerhub.services.AuthService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authManager;
    private final JwtProvider jwtProvider;
    private final AuthUserRegisterRepository authUserRegisterRepository;
    private final AuthUserRepository authUserRepository;

    private AuthServiceImpl(
                            AuthenticationManager authManager,
                            JwtProvider jwtProvider,
                            AuthUserRegisterRepository authUserRegisterRepository,
                            AuthUserRepository authUserRepository
                            ){
        this.authManager = authManager;
        this.jwtProvider = jwtProvider;
        this.authUserRegisterRepository = authUserRegisterRepository;
        this.authUserRepository = authUserRepository;

    }


    @Override
    public void register(AuthUserRegisterForm form) {
        AuthUserRegister user = form.toEntity();
        user = this.authUserRegisterRepository.save(user);
    }

    @Override
    public boolean checkEmailNotTaken(String email) {
        return false;
    }

    @Override
    public boolean userExists(String password, String login) {
        return false;
    }

    @Override
    public AuthDTO login(LoginForm form){
        //Création de l'authentication avec les credentials
        Authentication auth = new UsernamePasswordAuthenticationToken(form.getLogin(),form.getPassword());
        form.setPassword(null);//raz du password pour des raisons de sécurité

        // confirmer les credentials de l'utilisateur avec l'AuthenticationManager
        auth = authManager.authenticate((auth));

        // gérérer a jwt
        String accessToken = jwtProvider.generateAccessToken(auth);
        String refreshToken = jwtProvider.generateRefreshToken(auth);

        //return l'objet AuthDTO qui contient le login, le role et le jwt de l'utilisateur authentifié
        return AuthDTO.from(auth, accessToken, refreshToken);
    }

    @Override
    public AuthDTO refreshJWT(String refreshToken) {
        if(refreshToken != null){

            refreshToken = refreshToken.replaceFirst("bearer","");
            if(jwtProvider.validateRefreshToken(refreshToken)){
                Authentication auth = jwtProvider.createAuthentication(refreshToken);
                return AuthDTO.from(auth, jwtProvider.generateAccessToken(auth), refreshToken);
            }
        }
        throw new InvalidRefreshTokenException(refreshToken);
    }

    @Override
    public List<AuthDTO> getAll() {
//        return authUserRegisterRepository.findAll().stream()
//                .map(AuthDTO::toDto)
//                .toList();
        return null;
    }

    @Override
    public AuthDTO getOne(Long id) {
        return null;
    }

    @Override
    public void updateUser(Long id, AuthUserRegisterForm form) {

    }

    @Override
    public void removeUser(Long id) {

    }

}
