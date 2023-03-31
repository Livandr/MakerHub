package com.technobel.makerhub.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Embeddable
@Getter @Setter
public class Address implements Serializable {

    @Column(name = "address_name")
    private String streetName;

    @Column(name = "address_number")
    private String streetNumber;

    @Column(name = "address_box_number")
    private String streetBoxNumber;

    @Column(name = "address_postal_code")
    private int postCode;

    @Column(name = "address_city")
    private String city;

    @Column(name = "country")
    private String country;
    @Column(name = "region")
    private String region;
}
