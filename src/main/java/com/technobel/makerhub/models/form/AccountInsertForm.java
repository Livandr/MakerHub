package com.technobel.makerhub.models.form;

import com.technobel.makerhub.models.entity.accounts.Account;
import lombok.Data;

@Data
public class AccountInsertForm {

    private int accountNumber;
    private String accountTitle;
//    private String type;

    public Account toEntity(){
        Account account =  new Account();

        account.setAccountNumber(accountNumber);
        account.setAccountTitle(accountTitle);


        return account;
    }
}
