package com.technobel.makerhub.models.entity.users;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PROPERTY_MANAGER")
public class PropertyManager extends User{

    @Override
    public void setRole() {
        this.setRole("PROPERTY_MANAGER");
    }
}
