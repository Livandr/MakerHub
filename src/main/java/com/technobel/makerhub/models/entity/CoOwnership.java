package com.technobel.makerhub.models.entity;

import com.technobel.makerhub.models.entity.accounts.Account;
import com.technobel.makerhub.models.entity.users.CoOwner;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Entity
@Table(name = "co_ownership")
@Getter @Setter
public class CoOwnership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_ownership_id", nullable = false)
    private Long id;
    @Column(name ="co_ownership_bce")
    private String bce;
    @Column(name = "co_ownership_name", nullable = false)
    private String coOwnershipName;
    @Column(name = "co_ownership_address_name")
    private String coOwnershipAddressName;
    @Column(name = "co_ownership_address_number")
    private String coOwnershipAddressNumber;
    @Column(name = "co_ownership_address_box_number")
    private String coOwnershipAddressBoxNumber;
    @Column(name = "co_ownership_postalcode")
    private int coOwnershipPostalCode;
    @Column(name = "co_ownership_city")
    private String coOwnershipCity;
    @Column(name = "co_ownership_detail_iban")
    private String bankDetailIBAN;
    @Column(name = "co_ownership_detail_bic")
    private String bankDetailBIC;

    @ManyToMany
    private Set<Lot> lots = new LinkedHashSet<>();
    @OneToMany
    private Set<Account> accountSet = new LinkedHashSet<>();

    @ManyToMany
    private Set<CoOwner> coOwners = new LinkedHashSet<>();


}
