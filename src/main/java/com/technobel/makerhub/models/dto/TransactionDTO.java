package com.technobel.makerhub.models.dto;

import com.technobel.makerhub.models.entity.accounts.Transaction;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransactionDTO {

    private final Long id;
    private final String type;
    private final String transactionLabel;
    private final double amount;


    public static TransactionDTO toDtO(Transaction entity) {

        if(entity == null)
            return null;

        return new TransactionDTO(
                entity.getId(),
                entity.getType(),
                entity.getTransactionLabel(),
                entity.getAmount()
        );
    }
}
