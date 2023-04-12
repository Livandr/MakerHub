package com.technobel.makerhub.models.form;

import com.technobel.makerhub.models.entity.*;
import com.technobel.makerhub.models.entity.accounts.Account;
import com.technobel.makerhub.models.entity.users.CoOwner;
import lombok.Data;

import java.util.Set;

@Data
public class CustomerRegisterForm {
    private String bce;
    private String coOwnershipName;
    private String streetName;
    private String streetNumber;
    private String streetBoxNumber;
    private int postalCode;
    private String city;
    private String bankDetailIBAN;
    private String bankDetailBIC;
//    private Set<Lot> lots;
//    private Set<Account> accountSet;


    public CustomerRegister toEntity(){
        CustomerRegister coOwnership = new CustomerRegister();

        coOwnership.setBce(bce);
        coOwnership.setCoOwnershipName(coOwnershipName);
        coOwnership.setStreetName(streetName);
        coOwnership.setStreetNumber(streetNumber);
        coOwnership.setStreetBoxNumber(streetBoxNumber);
        coOwnership.setPostalCode(postalCode);
        coOwnership.setCity(city);
        coOwnership.setBankDetailIBAN(bankDetailIBAN);
        coOwnership.setBankDetailBIC(bankDetailBIC);

        return coOwnership;
    }


}
