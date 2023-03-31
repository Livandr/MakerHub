package com.technobel.makerhub.models.form;

import com.technobel.makerhub.models.entity.Address;
import com.technobel.makerhub.models.entity.BankAccountDetails;
import com.technobel.makerhub.models.entity.Supplier;
import lombok.Data;

@Data
public class SupplierForm {

    private String bceNumber;
    private String supplierName;
    private Address supplierAddress;
    private String phone;
    private String email;
    private BankAccountDetails bankAccount;

    public Supplier toEntity(){
        Supplier supplier= new Supplier();

        supplier.setBceNumber(bceNumber);
        supplier.setSupplierName(supplierName);
        supplier.setAddress(supplierAddress);
        supplier.setPhone(phone);
        supplier.setEmail(email);
        supplier.setBankAccount(bankAccount);

        return supplier;
    }
}
