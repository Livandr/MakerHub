package com.technobel.makerhub.models.dto;

import com.technobel.makerhub.models.entity.accounts.Account;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Builder
public class AccountDTO {


    private final int accountNumber;
    private final String accountTitle;
    private final String type;


    public static AccountDTO toDto(Account entity){
        if(entity == null)
            return null;

        return new AccountDTO(

                entity.getAccountNumber(),
                entity.getAccountTitle(),
                entity.getAccountType()


        );
    }


    public TransactionDTO[] getTransactions() {
        return new TransactionDTO[0];
    }
}
