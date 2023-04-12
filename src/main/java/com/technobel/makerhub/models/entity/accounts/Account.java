package com.technobel.makerhub.models.entity.accounts;

import com.technobel.makerhub.models.entity.Invoice;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Getter @Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", nullable = false)
    private Long accountId;
    @Column(nullable = false)
    private int accountNumber;
    @Column(nullable = false)
    private String accountTitle;
    @Column(name = "type",insertable = false, updatable = false, nullable = false)
    private String accountType;

    @Column(nullable = false)
    private double debitBalance = 0.0;
    @Column(nullable = false)
    private double creditBalance = 0.0;
    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions= new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "chart_of_accounts_id")
    private ChartOfAccounts chartOfAccounts;

}
