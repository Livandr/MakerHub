package com.technobel.makerhub.validation.validators;

import com.technobel.makerhub.models.form.LoginForm;
import com.technobel.makerhub.services.AuthService;
import com.technobel.makerhub.validation.constraints.UserExists;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class UserExistsValidator implements ConstraintValidator<UserExists, LoginForm> {

    private final AuthService authService;

    public UserExistsValidator(AuthService authService){
        this.authService = authService;
    }

    @Override
    public boolean isValid(LoginForm form, ConstraintValidatorContext constraintValidatorContext) {
        return authService.userExists(form.getUsername(), form.getPassword());
    }
}
