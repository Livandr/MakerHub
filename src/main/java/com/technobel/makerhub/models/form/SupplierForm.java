package com.technobel.makerhub.models.form;

import com.technobel.makerhub.models.entity.Supplier;
import lombok.Data;

@Data
public class SupplierForm {

    private String bceNumber;
    private String supplierName;
    private String streetName;
    private String streetNumber;
    private String streetBoxNumber;
    private int postalCode;
    private String city;
    private String phone;
    private String email;
    private String bankDetailIBAN;
    private String bankDetailBIC;


    public Supplier toEntity(){
        Supplier supplier= new Supplier();

        supplier.setBceNumber(bceNumber);
        supplier.setSupplierName(supplierName);
        supplier.setStreetName(streetName);
        supplier.setStreetNumber(streetNumber);
        supplier.setStreetBoxNumber(streetBoxNumber);
        supplier.setPostalCode(postalCode);
        supplier.setCity(city);
        supplier.setPhone(phone);
        supplier.setEmail(email);
        supplier.setBankDetailIBAN(bankDetailIBAN);
        supplier.setBankDetailBIC(bankDetailBIC);

        return supplier;
    }


}
