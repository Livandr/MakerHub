package com.technobel.makerhub.models.entity.accounts;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("customer_account")
@Getter @Setter
public class CustomerAccount extends Account{


}
