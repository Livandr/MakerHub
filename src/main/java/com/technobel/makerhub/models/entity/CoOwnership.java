package com.technobel.makerhub.models.entity;

import com.technobel.makerhub.models.entity.accounts.Account;
import com.technobel.makerhub.models.entity.accounts.BankAccount;
import com.technobel.makerhub.models.entity.users.CoOwner;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Entity
@Table(name = "co_ownership")
@Getter@Setter
public class CoOwnership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_ownership_id", nullable = false)
    private Long id;
    @Column(name ="co_ownership_bce")
    private String bce;
    @Column(name = "co_ownership_name", nullable = false)
    private String coOwnershipName;
    @Column(name = "co_ownership_address", nullable = false)
    private Address coOwnershipAddress;

    @Column(name = "current_bank_account", nullable = false)
    private BankAccountDetails currentBankAccount;
//    @Column(name = "saving_bank_account")
//    private BankAccountDetails savingBankAccount;
//    @Column(name = "other_bank_account")
//    private BankAccountDetails otherBankAccount;

    @ManyToMany
    private Set<Lot> coOwnershipLots = new LinkedHashSet<>();
    @OneToMany
    private Set<Account> accountSet = new LinkedHashSet<>();

    @ManyToMany
    private Set<CoOwner> coOwners = new LinkedHashSet<>();

}
