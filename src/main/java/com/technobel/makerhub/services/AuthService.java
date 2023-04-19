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

    AuthDTO login(LoginForm form);

    AuthDTO refreshJWT(String refreshToken);



}
