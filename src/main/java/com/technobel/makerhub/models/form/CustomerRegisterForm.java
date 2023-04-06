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
    private CoOwnershipAddress address;
    private CoOwnershipBank1 bankAccount;
//    private BankAccountDetails savingBankAccount;
//    private BankAccountDetails otherBankAccount;
    private Set<Lot> lots;
    private Set<Account> accountSet;



    public CustomerRegister toEntity(){
        CustomerRegister coOwnership = new CustomerRegister();

        coOwnership.setBce(bce);
        coOwnership.setCoOwnershipName(coOwnershipName);
        coOwnership.setAddress(address.toEntity());
        coOwnership.setBankAccountDetails(bankAccount.toEntity());
//        coOwnership.setSavingBankAccount(savingBankAccount);
//        coOwnership.setOtherBankAccount(otherBankAccount);
//        coOwnership.setLots(lots);
//        coOwnership.setAccountSet(accountSet);


        return coOwnership;
    }

    @Data
    public static class CoOwnershipAddress{

        private String streetName;
        private String number;
        private String boxNumber;
        private int postalCode;
        private String city;
        private String country;
        private String region;

        private Address toEntity(){


            Address address = new Address();

            address.setStreetName(streetName);
            address.setStreetNumber(number);
            address.setPostCode(postalCode);
            address.setCity(city);
            address.setRegion(region);
            address.setCountry(country);

            return address;
        }
    }

    @Data
    public static class CoOwnershipBank1{
        private String bankAccountType;
        private String accountTitle;
        private String iban;
        private String bic;
        private String bankAgency;

        public BankAccountDetails toEntity() {

            BankAccountDetails bank1 = new BankAccountDetails();

            bank1.setBankAccountType(bankAccountType);
            bank1.setAccountTitle(accountTitle);
            bank1.setIban(iban);
            bank1.setIban(bic);
            bank1.setBankAgency(bankAgency);

            return bank1;
        }

    }

}
