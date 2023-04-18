package com.technobel.makerhub.repository;

import com.technobel.makerhub.models.entity.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<User, Long> {


//    Optional<User> findByLogin(String login);

    boolean existsByUsernameAndPassword(String username, String password);

    Optional<User> findByUsername(String username);
}
