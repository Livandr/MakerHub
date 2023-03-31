package com.technobel.makerhub.models.entity.accounts;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("charge_account")
@Getter @Setter
public class ChargeAccount extends Account{
}
