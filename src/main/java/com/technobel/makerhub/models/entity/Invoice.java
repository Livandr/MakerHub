package com.technobel.makerhub.models.entity;

import com.technobel.makerhub.models.entity.accounts.Account;
import com.technobel.makerhub.models.entity.accounts.SupplierAccount;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "invoice")
@Getter @Setter
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "invoice_date", nullable = false)
    private LocalDate invoiceDate;
    @Column(name = "amount_excluding_vat", nullable = false)
    private double amountExclVat;

    @Column(name = "vat")
    private int vat;
    @Column(name = "amount_including_vat", nullable = false)
    private double amountInclVat;

    @Column(name = "due_date")
    private LocalDate dueDate;


    @ManyToOne
    private Supplier supplier;

    @OneToMany
    private Set<Account> accounts = new LinkedHashSet<>();


}
