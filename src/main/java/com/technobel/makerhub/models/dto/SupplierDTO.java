package com.technobel.makerhub.models.dto;

import com.technobel.makerhub.models.entity.Address;
import com.technobel.makerhub.models.entity.BankAccountDetails;
import com.technobel.makerhub.models.entity.accounts.BankAccount;
import com.technobel.makerhub.models.entity.Supplier;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SupplierDTO {
    private final Long id;
    private final String bceNumber;
    private final String supplierName;
    private final Address address;
    private final String phone;
    private final String email;
    private final BankAccountDetails bankAccount;

    public static SupplierDTO toDTO(Supplier entity){
        if( entity == null )
            return null;

        return new SupplierDTO(
                entity.getSupplierId(),
                entity.getBceNumber(),
                entity.getSupplierName(),
                entity.getAddress(),
                entity.getPhone(),
                entity.getEmail(),
                entity.getBankAccount()
        );


    }


}
