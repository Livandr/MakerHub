package com.technobel.makerhub.controllers;


import com.technobel.makerhub.models.dto.AuthUserDTO;
import com.technobel.makerhub.models.form.AuthUserRegisterForm;

import com.technobel.makerhub.services.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }


    @GetMapping("/all")
    public List<AuthUserDTO> getAll(){ return authService.getAll();}

    @GetMapping("/{id:[0-9]}")
    public AuthUserDTO getOne(@PathVariable long id){
        return authService.getOne(id);
    }

    @PutMapping("/{id:[0-9]+}/update")
    public void updateUser(@PathVariable long id, @RequestBody @Valid AuthUserRegisterForm form){
        authService.updateUser(id, form);
    }

    @DeleteMapping("/{id:[0-9]+}/delete")
    public void removeSupplier(@PathVariable long id){
        authService.removeUser(id);
    }


}
