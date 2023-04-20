package com.technobel.makerhub.controllers;

import com.technobel.makerhub.models.dto.AccountDTO;
import com.technobel.makerhub.models.dto.TransactionDTO;
import com.technobel.makerhub.models.entity.accounts.Account;
import com.technobel.makerhub.models.entity.accounts.Transaction;
import com.technobel.makerhub.models.form.AccountInsertForm;
import com.technobel.makerhub.repository.AccountRepository;
import com.technobel.makerhub.services.AccountService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;
    private final AccountRepository accountRepository;

    private AccountController( AccountService accountService, AccountRepository accountRepository){
        this.accountService = accountService;
        this.accountRepository = accountRepository;
    }

    @GetMapping("/all")
    public List<AccountDTO> getAll(){
        return accountService.getAll();
    }

    @GetMapping("/charges")
    public List<AccountDTO> getChargesAndProducts(){
        return accountService.getChargesAndProducts();
    }

    @GetMapping("/suppliers")
    public List<AccountDTO> getSuppliers(){
        return  accountService.getSuppliers();
    }

    @GetMapping("/details/{id:[0-9]+}")
    public AccountDTO getOne(@PathVariable long id){
        return accountService.getOne(id);
    }

   @PostMapping("/transaction")
   public Account addAccount(@RequestBody AccountDTO accountDTO){
        Account account= new Account();
        account.setAccountNumber(accountDTO.getAccountNumber());
        account.setAccountTitle(account.getAccountTitle());


        List<Transaction> transactions = new ArrayList<>();
        for (TransactionDTO transactionDTO :  accountDTO.getTransactions()){
            Transaction transaction = new Transaction();
            transaction.setType(transactionDTO.getType());
            transaction.setAmount(transactionDTO.getAmount());
            transaction.setAccount(account);
            transactions.add(transaction);

        }
        account.setTransactions(transactions);
        return accountRepository.save(account);
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
