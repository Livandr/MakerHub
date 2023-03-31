package com.technobel.makerhub.services.impl;

import com.technobel.makerhub.models.dto.AccountDTO;
import com.technobel.makerhub.models.entity.accounts.Account;
import com.technobel.makerhub.models.form.AccountInsertForm;
import com.technobel.makerhub.repository.AccountRepository;
import com.technobel.makerhub.repository.SupplierRepository;
import com.technobel.makerhub.services.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final SupplierRepository supplierRepository;

    public AccountServiceImpl(AccountRepository accountRepository,
                              SupplierRepository supplierRepository){
        this.accountRepository = accountRepository;
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<AccountDTO> getAll() {
        return accountRepository.findAll().stream()
                .map(AccountDTO::toDto)
                .toList();

    }

    @Override
    public AccountDTO getOne(Long id) {
        return accountRepository.findById(id)
                .map(AccountDTO::toDto)
                .orElseThrow( () -> new RuntimeException("account not found"));
    }

    @Override
    public void addAccount(AccountInsertForm form) {
        Account account = form.toEntity();
        accountRepository.save(account);
    }

    @Override
    public void updateAccount(Long id, AccountInsertForm form) {
        Account account = accountRepository.findById(id)
                .orElseThrow();
        account.setAccountNumber(form.getAccountNumber());
        account.setAccountTitle(form.getAccountTitle());

        accountRepository.save(account);
    }

    @Override
    public void removeAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
