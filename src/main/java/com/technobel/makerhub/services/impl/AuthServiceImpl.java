package com.technobel.makerhub.services.impl;

import com.technobel.makerhub.models.dto.AuthDTO;
import com.technobel.makerhub.models.dto.AuthUserDTO;
import com.technobel.makerhub.models.entity.AuthUserRegister;
import com.technobel.makerhub.models.form.AuthUserRegisterForm;
import com.technobel.makerhub.repository.AuthUserRegisterRepository;
import com.technobel.makerhub.repository.AuthUserRepository;
import com.technobel.makerhub.services.AuthService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {



    private final AuthUserRegisterRepository authUserRegisterRepository;
    private final AuthUserRepository authUserRepository;

    private AuthServiceImpl(


                            AuthUserRegisterRepository authUserRegisterRepository,
                            AuthUserRepository authUserRepository
                            ){


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
