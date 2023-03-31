package com.technobel.makerhub.models.entity;

import jakarta.persistence.*;
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
    @Column(name = "supplier_address")
    private Address address;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private BankAccountDetails bankAccount;


}
