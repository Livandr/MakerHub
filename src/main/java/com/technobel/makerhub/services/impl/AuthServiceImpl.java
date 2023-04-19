package com.technobel.makerhub.services.impl;

//import com.technobel.makerhub.config.security.JwtProvider;


import com.technobel.makerhub.config.security.JwtProvider;
import com.technobel.makerhub.models.dto.AuthDTO;
import com.technobel.makerhub.models.entity.users.User;
import com.technobel.makerhub.models.form.LoginForm;
import com.technobel.makerhub.repository.AuthUserRepository;
import com.technobel.makerhub.services.AuthService;

import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {


    private final AuthenticationManager authManager;
    private final AuthUserRepository authUserRepository;
    private final JwtProvider jwtProvider;
//    private final PasswordEncoder encoder;



    public AuthServiceImpl(

            AuthenticationManager authManager,
            AuthUserRepository authUserRepository,
            JwtProvider jwtProvider
//            PasswordEncoder encoder
    ){
        this.authManager = authManager;
        this.authUserRepository = authUserRepository;
        this.jwtProvider = jwtProvider;
//        this.encoder = encoder;
    }

//    @Override
//    public AuthDTO login(LoginForm form) {
//       authManager.authenticate( new UsernamePasswordAuthenticationToken ( form.getLogin(), form.getPassword() ));
//
//        User user = authUserRepository.findByLogin(form.getLogin())
//                .orElseThrow();
//
//        String jwt = jwtProvider.generateToken(user.getLogin(), user.getRole());
//
//        return AuthDTO.builder()
//                .username(user.getLogin())
//                .role(user.getRole())
//                .token( jwt )
//                .build();
//    }





    @Override
    public boolean checkEmailNotTaken(String email) {
        return false;
    }

    @Override
    public boolean userExists(String password, String login) {
        return false;
    }

    @Override
    public AuthDTO login(LoginForm form) {

        //Création de l'authentication object avec les credentials (login, password)
        Authentication authentication = new UsernamePasswordAuthenticationToken(form.getLogin(), form.getPassword());
        form.setPassword(null); //RAZ du password pour raison de sécurité

        //Authentication des user's cred avec l'AuthenticationManager
        authentication = authManager.authenticate(authentication);// if invalid credentials, AuthenticationException is thrown.

        //générer un JWT utilisant les authenticated user's data
        String accessToken = jwtProvider.generateAccessToken(authentication);
        String refreshToken = jwtProvider.generateRefreshToken(authentication);

        //build and return an AuthDTO object containing the authenticated user's username, role, and JWT
        return AuthDTO.from(authentication, accessToken, refreshToken);
    }

    @Override
    public AuthDTO refreshJWT(String refreshToken) {
        if(refreshToken != null){
            refreshToken = refreshToken.replaceFirst("Bearer ", "");
            if(jwtProvider.validateRefreshToken(refreshToken) ){
                Authentication authentication = jwtProvider.createAuthentication(refreshToken);
                return AuthDTO.from(authentication, jwtProvider.generateAccessToken(authentication), refreshToken);
            }
        }
        throw new RuntimeException(refreshToken);
    }


}
