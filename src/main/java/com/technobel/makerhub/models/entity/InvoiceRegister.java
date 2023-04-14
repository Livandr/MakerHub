package com.technobel.makerhub.models.entity;

import com.technobel.makerhub.models.entity.accounts.SupplierAccount;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
public class InvoiceRegister {
    private static int invoiceCount = 0;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_registration_id", nullable = false)
    private Long invoice_registration_id;

    @Column(name = "invoice_number", nullable = false)
    private int invoiceNumber = ++invoiceCount;
    @Column(name = "invoice_date", nullable = false)
    private LocalDate invoiceDate;
    @Column(name= "invoice_description", nullable = false)
    private String invoiceDescription;
    @Column(name = "amount_excl_vat", nullable = false)
    private double amountExclVat;
    @Column(name = "vat")
    private double vat;
    @Column(name = "amount_including_vat", nullable = false)
    private double amountInclVat = amountExclVat * (vat/100);
    @Column(name = "due_date")
    private LocalDate dueDate;
    @Column
    private String AddtionalNotes;


}
