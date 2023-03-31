package com.technobel.makerhub.services;

import com.technobel.makerhub.models.dto.AuthDTO;
import com.technobel.makerhub.models.form.AuthUserRegisterForm;
import com.technobel.makerhub.models.form.LoginForm;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AuthService {



    void register(AuthUserRegisterForm form);

    boolean checkEmailNotTaken(String email);
    boolean userExists(String password, String login);

    AuthDTO login(LoginForm form);
    AuthDTO refreshJWT(String refreshToken);

    List<AuthDTO> getAll();
    AuthDTO getOne(Long id);

    void updateUser(Long id, AuthUserRegisterForm form);
    void removeUser(Long id);
}
