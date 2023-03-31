package com.technobel.makerhub.models.entity;

import com.technobel.makerhub.models.entity.users.CoOwner;
import com.technobel.makerhub.models.entity.users.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;


@Getter
@Setter
@Embeddable

public class BankAccount {

    @Column(nullable = false)
    private String AccountName;

    @Column
    private String accountType;
    @Column(nullable = false)
    private String bic;
    @Column(nullable = false)
    private String iban;
    @Column(nullable = false)
    private double debitAmount;
    @Column(nullable = false)
    private double creditAmount;
    @Column(nullable = false)
    private double debitBalance;
    @Column(nullable = false)
    private double creditBalance;

        public BankAccount() {

    }
}
