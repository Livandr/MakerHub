package com.technobel.makerhub.controllers;


import com.technobel.makerhub.models.dto.AuthDTO;
import com.technobel.makerhub.models.dto.AuthUserDTO;
import com.technobel.makerhub.models.form.AuthUserRegisterForm;

import com.technobel.makerhub.models.form.LoginForm;
import com.technobel.makerhub.services.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/login")
    public AuthDTO login(@RequestBody @Valid LoginForm form){
        return authService.login(form);
    }





}
