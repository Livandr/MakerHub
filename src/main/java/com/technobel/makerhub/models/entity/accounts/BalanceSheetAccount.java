package com.technobel.makerhub.models.entity.accounts;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("general_account")
@Getter @Setter
public class BalanceSheetAccount extends Account{
}
