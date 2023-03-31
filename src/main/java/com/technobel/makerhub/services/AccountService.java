package com.technobel.makerhub.services;

import com.technobel.makerhub.models.dto.AccountDTO;
import com.technobel.makerhub.models.form.AccountInsertForm;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {

    List<AccountDTO> getAll();
    AccountDTO getOne(Long id);

    void addAccount(AccountInsertForm form);

    void updateAccount(Long id, AccountInsertForm form);

    void removeAccount(Long id);
}
