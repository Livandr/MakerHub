package com.technobel.makerhub.models.entity;

import com.technobel.makerhub.validation.constraints.EmailNotTaken;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class AuthUserRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "role", nullable = false)
    private String role;
    @Column(name = "bce")
    private String bce;
    @Column(name ="lastname", nullable = false)
    private String lastname;
    @Column
    private String firstname;
    @Column(name = "mail")
    @Email
    @EmailNotTaken
    private String email;
    @Column
    private String phone;
    @Column
    private Address address;
    @Column
    @Size(min = 6)
    private String login;
    private String password;
    private String passwordConfirmed;


}
