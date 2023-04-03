package com.technobel.makerhub.controllers;

import com.technobel.makerhub.models.dto.AccountDTO;
import com.technobel.makerhub.models.form.AccountInsertForm;
import com.technobel.makerhub.services.AccountService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;
    private AccountController(AccountService accountService){
        this.accountService = accountService;    }

    @GetMapping("/all")
    public List<AccountDTO> getAll(){
        return accountService.getAll();
    }

    @GetMapping("/{id:[0-9]+}")
    public AccountDTO getOne(@PathVariable long id){
        return accountService.getOne(id);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addAccount(@RequestBody @Valid AccountInsertForm form){
        accountService.addAccount(form);
    }

    @PutMapping("/{id:[0-9]+}/update")
    public void updateAccount(@PathVariable long id, AccountInsertForm form){
        accountService.updateAccount(id, form);
    }

    @DeleteMapping("/{id:[0-9]+}/delete")
    public void removeAccount(@PathVariable long id){
        accountService.removeAccount(id);
    }


}
