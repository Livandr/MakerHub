package com.technobel.makerhub.models.entity.users;

public class CoOwner extends User{


    @Override
    public void setRole() {
        this.setRole("CO_OWNER");
    }
}
