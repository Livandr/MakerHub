package com.technobel.makerhub.models.entity.users;

import com.technobel.makerhub.models.entity.BankAccountDetails;
import com.technobel.makerhub.models.entity.accounts.BankAccount;
import com.technobel.makerhub.models.entity.Lot;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("CO_OWNER")
public class CoOwner extends User{

    @Column(name = "co-owner_addressname")
    private String streetName;
    @Column(name = "co-owner_streetnumber")
    private String streetNumber;
    @Column(name = "co-owner_streetboxnumber")
    private String streetBoxNumber;
    @Column(name = "co-owner_postalcode")
    private int postalCode;
    @Column(name = "co-owner_city")
    private String city;
    @Column(name = "co-owner_phone")
    private String phone;
    @Column(name = "co-owner_mail")
    private String email;
    @Column(name = "co-owner_bank_detail_bic")
    private String bankDetailIBAN;
    @Column(name = "co-owner_bank_detail_iban")
    private String bankDetailBIC;


    @Override
    public void setRole() {
        this.setRole("CO_OWNER");
    }


}
