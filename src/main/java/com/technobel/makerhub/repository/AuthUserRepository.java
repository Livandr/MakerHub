package com.technobel.makerhub.repository;

import com.technobel.makerhub.models.entity.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);

    boolean existsByLoginAndPassword(String login, String password);
}
