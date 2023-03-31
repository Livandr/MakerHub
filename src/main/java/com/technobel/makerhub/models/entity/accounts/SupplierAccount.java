package com.technobel.makerhub.models.entity.accounts;

import com.technobel.makerhub.models.entity.Invoice;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("supplier_account")
@Getter @Setter
public class SupplierAccount extends Account{

}
