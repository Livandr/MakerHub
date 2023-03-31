package com.technobel.makerhub.models.dto;

import com.technobel.makerhub.models.entity.Address;
import com.technobel.makerhub.models.entity.users.User;
import lombok.Data;

import java.io.Serializable;

@Data
public class AuthUserDTO implements Serializable {
    private final Long id;
    private final String bce;
    private final String lastname;
    private final String firstname;
    private final String email;

    public static AuthUserDTO toDto(User entity){
        if(entity == null)
            return null;

        return  new AuthUserDTO(
                entity.getId(),
                entity.getBce(),
                entity.getLastname(),
                entity.getFirstname(),
                entity.getEmail()

        );
    }
}
