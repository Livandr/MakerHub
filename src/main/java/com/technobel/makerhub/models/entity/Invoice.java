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

    private static int invoiceCount = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "invoice_number", nullable = false)
    private int invoiceNumber = ++invoiceCount;

    @Column(name = "invoice_date", nullable = false)
    private LocalDate invoiceDate;

    @Column(name="invoice_description", nullable = false)
    private String invoiceDescription;
    @Column(name = "amount_excluding_vat", nullable = false)
    private double amountExclVat;
    @Column(name = "vat")
    private double vat;
    @Column(name = "amount_including_vat", nullable = false)
    private double amountInclVat = amountExclVat * (vat/100);
    @Column(name = "due_date")
    private LocalDate dueDate;
    @Column
    private String AddtionalNotes;
    @ManyToOne
    @JoinColumn(name = "made_by_id", nullable = false)
    private Supplier madeBy;
    @ManyToOne
    private CoOwnership coOwnership;
//    @Override
//    public String toString(){
//        return "Facture{" +
//                "numeroFacture=" + invoiceNumber +
//                ", date=" + invoiceDate +
//                ", nomFournisseur='" + madeBy + '\'' +
//                ", description='" + invoiceDescription + '\'' +
//                ", montant TVAC =" + amountInclVat +
//                '}';
//    }



}
