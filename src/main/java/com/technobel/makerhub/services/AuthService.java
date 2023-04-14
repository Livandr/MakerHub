package com.technobel.makerhub.services;

import com.technobel.makerhub.models.dto.AuthDTO;
import com.technobel.makerhub.models.dto.AuthUserDTO;
import com.technobel.makerhub.models.form.AuthUserRegisterForm;
import com.technobel.makerhub.models.form.LoginForm;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AuthService {


    boolean checkEmailNotTaken(String email);
    boolean userExists(String password, String login);

//    AuthDTO login(LoginForm form);
//    AuthUserDTO refreshJWT(String refreshToken);

//    List<AuthUserDTO> getAll();
//    AuthUserDTO getOne(Long id);
//
//    void updateUser(Long id, AuthUserRegisterForm form);
//    void removeUser(Long id);


}
