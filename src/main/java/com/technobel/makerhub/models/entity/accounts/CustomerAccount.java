package com.technobel.makerhub.models.entity.accounts;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("customer_account")
@Getter @Setter
public class CustomerAccount extends Account{

    private static int customerCount = 400000;

    @Override
    public void setAccountNumber(int accountNumber) {
        super.setAccountNumber(++customerCount);
    }
}
