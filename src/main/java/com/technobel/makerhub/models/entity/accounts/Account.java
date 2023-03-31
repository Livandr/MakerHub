package com.technobel.makerhub.models.entity.accounts;

import com.technobel.makerhub.models.entity.Invoice;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Getter @Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private int accountNumber;
    @Column(nullable = false)
    private String accountTitle;
    @Column(name = "type", nullable = false, insertable=false, updatable = false)
    private String type;
    @Column(nullable = false)
    private double debitAmount;
    @Column(nullable = false)
    private double creditAmount;
    @Column(nullable = false)
    private double debitBalance;
    @Column(nullable = false)
    private double creditBalance;
//    @ManyToMany
//    private Set<Invoice> invoices= new LinkedHashSet<>();
}
