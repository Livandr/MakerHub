package com.technobel.makerhub.controllers;

import com.technobel.makerhub.models.dto.AuthDTO;
import com.technobel.makerhub.models.form.LoginForm;
import com.technobel.makerhub.services.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/login")
    public AuthDTO login(@RequestBody LoginForm form){
        return authService.login((form));
    }

    @GetMapping("/refresh")
    public AuthDTO refreshToken(@RequestHeader("X-Refresh-Token")String refreshToken){
        return authService.refreshJWT(refreshToken);
    }
}
