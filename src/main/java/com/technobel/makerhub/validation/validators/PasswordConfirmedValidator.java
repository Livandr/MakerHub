package com.technobel.makerhub.validation.validators;

import com.technobel.makerhub.models.form.AuthUserRegisterForm;
import com.technobel.makerhub.validation.constraints.PasswordConfirmed;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordConfirmedValidator implements ConstraintValidator<PasswordConfirmed, AuthUserRegisterForm> {

    @Override
    public boolean isValid(AuthUserRegisterForm form, ConstraintValidatorContext constraintValidatorContext) {
        return form.getPassword().equals(form.getPasswordConfirmed());
    }
}
