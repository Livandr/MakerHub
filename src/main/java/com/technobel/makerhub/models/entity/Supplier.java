package com.technobel.makerhub.models.entity;

import com.technobel.makerhub.models.entity.accounts.SupplierAccount;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "supplier")
@Getter @Setter
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private Long supplierId;
    @Column(name = "bce")
    private String bceNumber;
    @Column(name = "supplier_name", nullable = false)
    private String supplierName;
    @Column(name = "supplier_streetname")
    private String streetName;
    @Column(name = "supplier_streetnumber")
    private String streetNumber;
    @Column(name = "supplier_streetboxnumber")
    private String streetBoxNumber;
    @Column(name = "supplier_postalcode")
    private int postalCode;
    @Column(name = "supplier_city")
    private String city;
    @Column(name = "supplier_phone")
    private String phone;
    @Column(name = "supplier_mail")
    @Email
    private String email;
    @Column(name = "supplier_bank_detail_iban")
    private String bankDetailIBAN;
    @Column(name = "supplier_bank_detail_bic")
    private String bankDetailBIC;

    @OneToOne
    @JoinColumn(name = "supplier_account_id")
    private SupplierAccount supplierAccount;

}
