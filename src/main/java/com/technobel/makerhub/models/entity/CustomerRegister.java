package com.technobel.makerhub.models.entity;

import com.technobel.makerhub.models.entity.accounts.Account;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter @Setter
public class CustomerRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_registration_id")
    private Long customer_registration_id;

    @Column
    private String bce;
    @Column(nullable = false)
    private String coOwnershipName;
    @Column
    private String streetName;
    @Column
    private String streetNumber;
    @Column
    private String streetBoxNumber;
    @Column
    private int postalCode;
    @Column
    private String city;
    @Column
    private String bankDetailIBAN;
    @Column
    private String bankDetailBIC;
//    @Column
//    private Set<Account> accountSet;
//    @Column
//    private Set<Lot> lots;




}
