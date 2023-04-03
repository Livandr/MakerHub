package com.technobel.makerhub.models.form;

import com.technobel.makerhub.models.entity.Address;
import com.technobel.makerhub.models.entity.BankAccountDetails;
import com.technobel.makerhub.models.entity.CoOwnership;
import com.technobel.makerhub.models.entity.accounts.Account;
import com.technobel.makerhub.models.entity.Lot;
import com.technobel.makerhub.models.entity.users.CoOwner;
import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
public class CoOwnershipRegisterForm {
    private String bce;
    private String coOwnershipName;
    private Address coOwnershipAddress;
    private BankAccountDetails currentBankAccount;
//    private BankAccountDetails savingBankAccount;
//    private BankAccountDetails otherBankAccount;
    private Set<Lot> lotSet;
    private Set<Account> accounts;
    private Set<CoOwner> coOwners;

    public CoOwnership toEntity(){
        CoOwnership coOwnership = new CoOwnership();

        coOwnership.setBce(bce);
        coOwnership.setCoOwnershipName(coOwnershipName);
        coOwnership.setCoOwnershipAddress(coOwnershipAddress);
        coOwnership.setCurrentBankAccount(currentBankAccount);
//        coOwnership.setSavingBankAccount(savingBankAccount);
//        coOwnership.setOtherBankAccount(otherBankAccount);
        coOwnership.setCoOwnershipLots(lotSet);
        coOwnership.setAccountSet(accounts);
        coOwnership.setCoOwners( coOwners );

        return coOwnership;
    }

}
