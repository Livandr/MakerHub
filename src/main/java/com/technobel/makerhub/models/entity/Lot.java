package com.technobel.makerhub.models.entity;

import com.technobel.makerhub.models.entity.users.CoOwner;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter @Setter
public class Lot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lot_id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String reference;
    @Column(name = "type_of_lot", nullable = false)
    private String type;
    @Column
    private String description;
    @Column(nullable = false)
    private int share;

    @ManyToMany
    private Set<CoOwner> ownerSet = new LinkedHashSet<>();



}
