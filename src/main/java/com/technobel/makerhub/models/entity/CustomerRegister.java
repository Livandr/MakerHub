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
    @Column(name = "registration_id")
    private Long id;

    @Column
    private String bce;
    @Column(nullable = false)
    private String coOwnershipName;
    @Column
    private Address address;
    @Column
    private BankAccountDetails bankAccountDetails;
//    @Column
//    private Set<Account> accountSet;
//    @Column
//    private Set<Lot> lots;




}
