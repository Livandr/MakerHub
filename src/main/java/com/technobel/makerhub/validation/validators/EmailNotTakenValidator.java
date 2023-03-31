package com.technobel.makerhub.validation.validators;

import com.technobel.makerhub.services.AuthService;
import com.technobel.makerhub.validation.constraints.EmailNotTaken;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailNotTakenValidator implements ConstraintValidator<EmailNotTaken, String> {

    private final AuthService authService;

    public EmailNotTakenValidator(AuthService authService){
        this.authService = authService;
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return authService.checkEmailNotTaken(email);
    }
}
