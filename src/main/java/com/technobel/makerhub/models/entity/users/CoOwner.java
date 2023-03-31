package com.technobel.makerhub.models.entity.users;

import com.technobel.makerhub.models.entity.BankAccountDetails;
import com.technobel.makerhub.models.entity.accounts.BankAccount;
import com.technobel.makerhub.models.entity.Lot;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("CO_OWNER")
public class CoOwner extends User{

    @Column
    private BankAccountDetails bankAccountDetails;
    @OneToMany
    private Set<Lot> lots = new LinkedHashSet<>();
    @OneToOne
    private BankAccount account;

    @Override
    public void setRole() {
        this.setRole("CO_OWNER");
    }


}
