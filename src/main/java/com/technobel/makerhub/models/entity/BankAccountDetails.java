package com.technobel.makerhub.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter @Setter
public class BankAccountDetails {

    @Column(name = "bank_account_type")
    private String bankAccountType;
    @Column(name = "BIC")
    private String bic;
    @Column(name = "IBAN")
    private String iban;
    @Column(name = "account_title")
    private String accountTitle;
    @Column(name = "bank_agency")
    private String bankAgency;


}
