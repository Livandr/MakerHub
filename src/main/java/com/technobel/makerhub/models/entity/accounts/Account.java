package com.technobel.makerhub.models.entity.accounts;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "type")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private int accountNumber;
    @Column(nullable = false)
    private String accountTitle;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private double debitAmount;
    @Column(nullable = false)
    private double creditAmount;
    @Column(nullable = false)
    private double debitBalance;
    @Column(nullable = false)
    private double creditBalance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
