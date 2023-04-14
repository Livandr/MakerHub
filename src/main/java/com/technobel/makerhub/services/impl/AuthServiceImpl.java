package com.technobel.makerhub.services.impl;

//import com.technobel.makerhub.config.security.JwtProvider;
import com.technobel.makerhub.models.dto.AuthDTO;
import com.technobel.makerhub.models.dto.AuthUserDTO;
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
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {


//    private final AuthenticationManager authManager;
//    private final AuthUserRepository authUserRepository;
//    private final JwtProvider jwtProvider;
//
//
//
//    public AuthServiceImpl(
//
//            AuthenticationManager authManager,
//            AuthUserRepository authUserRepository,
//            JwtProvider jwtProvider
//    ){
//        this.authManager = authManager;
//        this.authUserRepository = authUserRepository;
//        this.jwtProvider = jwtProvider;
//    }
//
//    @Override
//    public AuthDTO login(LoginForm form) {
//        Authentication auth = new UsernamePasswordAuthenticationToken( form.getUsername(), form.getPassword() );
//
//        form.setPassword(null);
//        auth = authManager.authenticate(auth);
//        User user = authUserRepository.findByLogin(form.getUsername())
//                .orElseThrow();
//
//        String jwt = jwtProvider.generateToken(user.getUsername(), user.getRole());
//
//        return AuthDTO.builder()
//                .username(user.getUsername())
//                .roles(List.of(user.getRole()))
//                .token( jwt )
//                .build();
//    }
//
//    @Override
//    public AuthUserDTO refreshJWT(String refreshToken) {
//        return null;
//    }
//
//    ;



    @Override
    public boolean checkEmailNotTaken(String email) {
        return false;
    }

    @Override
    public boolean userExists(String password, String login) {
        return false;
    }


}
