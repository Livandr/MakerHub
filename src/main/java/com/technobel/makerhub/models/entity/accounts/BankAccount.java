package com.technobel.makerhub.models.entity.accounts;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;



@Entity
@DiscriminatorValue("bank_account")
@Getter @Setter
public class BankAccount extends Account{



}
