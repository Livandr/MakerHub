package com.technobel.makerhub.models.dto;

import com.technobel.makerhub.models.entity.accounts.Account;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDTO {

    private final Long id;
    private final int accountNumber;
    private final String type;
    public static AccountDTO toDto(Account entity){
        if(entity == null)
            return null;

        return new AccountDTO(
                entity.getId(),
                entity.getAccountNumber(),
                entity.getType()
        );
    }




}
