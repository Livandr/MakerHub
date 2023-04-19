package com.technobel.makerhub.models.dto;

import com.technobel.makerhub.models.entity.Supplier;
import com.technobel.makerhub.models.entity.accounts.SupplierAccount;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SupplierDTO {

    //Variables
    private final Long id;
    private final String bceNumber;
    private final String supplierName;
    private final String streetName;
    private final String streetNumber;
    private final String streetBoxNumber;
    private final int postalCode;
    private final String city;
    private final String phone;
    private final String email;
    private final String bankDetailIBAN;
    private final String bankDetailBIC;

    private final SupplierAccount supplierAccount;

    //La méthode STATIC est utile puisqu'on utilise qu'une fois la méthode
    public static SupplierDTO toDTO(Supplier entity){
        if( entity == null )
            return null;

        return new SupplierDTO(
                entity.getSupplierId(),
                entity.getBceNumber(),
                entity.getSupplierName(),
                entity.getStreetName(),
                entity.getStreetNumber(),
                entity.getStreetBoxNumber(),
                entity.getPostalCode(),
                entity.getCity(),
                entity.getPhone(),
                entity.getEmail(),
                entity.getBankDetailBIC(),
                entity.getBankDetailIBAN(),
                entity.getSupplierAccount()
        );


    }


}
