package com.technobel.makerhub.models.entity.users;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("ADMIN")
@Getter@Setter
public class Admin extends User{

    @Override
    public void setRole() {
        super.setRole("ADMIN");
    }
}
