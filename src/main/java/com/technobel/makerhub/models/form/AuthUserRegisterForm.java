package com.technobel.makerhub.models.form;

import com.technobel.makerhub.models.entity.Address;
import com.technobel.makerhub.models.entity.AuthUserRegister;
import com.technobel.makerhub.validation.constraints.EmailNotTaken;
import com.technobel.makerhub.validation.constraints.PasswordConfirmed;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@PasswordConfirmed
public class AuthUserRegisterForm {

    private String bce;
    private String lastname;
    private String  firstname;

    private String role;

    private String phone;
    private String email;
    private String login;
    @NotBlank(message = "enter a password")
    @Size(min = 6)
    private String password;

    @NotBlank(message = "confirm your password")
    private String passwordConfirmed;

    public AuthUserRegister toEntity(){
        AuthUserRegister authUser = new AuthUserRegister();

        authUser.setBce(bce);
        authUser.setLastname(lastname);
        authUser.setFirstname(firstname);
        authUser.setRole(role);
        authUser.setPhone(phone);
        authUser.setEmail(email);
        authUser.setLogin(login);
        authUser.setPassword(password);
        authUser.setPasswordConfirmed(passwordConfirmed);

        return authUser;
    }


}
