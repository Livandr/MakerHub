package com.technobel.makerhub.models.entity.users;


import com.technobel.makerhub.models.entity.Address;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "\"user\"")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role")
@Getter@Setter
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false, unique = true)
    private String login;
    @Column(nullable = false)
    @Size(min = 4)
    private String password;

    @Column(name = "role", nullable = false, insertable = false, updatable = false)
    private String role;
    @Column(name = "bce")
        private String bce;
    @Column(name = "lastname", nullable = false)
    private String lastname;
    @Column(name = "firstname", nullable = false)
    private String firstname;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;


    private boolean enabled = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_"+role));
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setRole() {

    }
}
