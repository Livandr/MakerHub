package com.technobel.makerhub.services.impl;

import com.technobel.makerhub.models.dto.AuthDTO;
import com.technobel.makerhub.models.dto.AuthUserDTO;
import com.technobel.makerhub.models.entity.AuthUserRegister;
import com.technobel.makerhub.models.entity.users.User;
import com.technobel.makerhub.models.form.AuthUserRegisterForm;
import com.technobel.makerhub.models.form.LoginForm;
import com.technobel.makerhub.repository.AuthUserRegisterRepository;
import com.technobel.makerhub.repository.AuthUserRepository;
import com.technobel.makerhub.services.AuthService;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {


//    private final AuthenticationManager authManager;
    private final AuthUserRegisterRepository authUserRegisterRepository;
    private final AuthUserRepository authUserRepository;

//    private final PasswordEncoder encoder;

    private AuthServiceImpl(

//            AuthenticationManager authManager,
            AuthUserRegisterRepository authUserRegisterRepository,
            AuthUserRepository authUserRepository
//            PasswordEncoder encoder
    ){

//        this.authManager = authManager;
        this.authUserRegisterRepository = authUserRegisterRepository;
        this.authUserRepository = authUserRepository;
//        this.encoder = encoder;
    }

//    @Override
//    public AuthDTO login(LoginForm form) {
//        authManager.authenticate(new UsernamePasswordAuthenticationToken( form.getLogin(), form.getPassword() ));
//
//        User user = authUserRepository.findByLogin(form.getLogin())
//                .orElseThrow();
//
//        String token =
//
//        return null;
//    }

//    @Override
//    public AuthUserDTO register(AuthUserRegisterForm form) {
//        User user = form.toEntity();
//        user = this.authUserRegisterRepository.save(user);
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
    public List<AuthUserDTO> getAll() {
//        return authUserRegisterRepository.findAll().stream()
//                .map(AuthDTO::toDto)
//                .toList();
        return null;
    }

    @Override
    public AuthUserDTO getOne(Long id) {
        return authUserRepository.findById(id)
                .map(AuthUserDTO::toDto)
                .orElseThrow( () -> new RuntimeException("user not found"));
    }

    @Override
    public void updateUser(Long id, AuthUserRegisterForm form) {

    }

    @Override
    public void removeUser(Long id) {

    }

}
