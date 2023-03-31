package com.technobel.makerhub.validation.constraints;

import com.technobel.makerhub.validation.validators.PasswordConfirmedValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordConfirmedValidator.class)
public @interface PasswordConfirmed {

    String message( ) default "wrong password";

    Class<? extends Payload>[] payload() default { };
}
