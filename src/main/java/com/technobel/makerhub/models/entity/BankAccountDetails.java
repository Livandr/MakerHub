package com.technobel.makerhub.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class BankAccountDetails {

    @Column(name = "bank_account_type", nullable = false)
    private String bankAccountType;
    @Column(name = "BIC", nullable = false)
    private String bic;
    @Column(name = "IBAN", nullable = false)
    private String iban;
    @Column(name = "account_title", nullable = false)
    private String accountTitle;
    @Column(name = "bank_agency", nullable = false)
    private String bankAgency;
}
