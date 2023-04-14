package com.technobel.makerhub.models.form;

import lombok.Data;

@Data
public class SupplierUpdateForm {

    private String supplierPhone;
    private String supplierMail;
    private String streetName;
    private String streetNumber;
    private String streetBoxNumber;
    private int postalCode;
    private String city;
    private String region;
}
