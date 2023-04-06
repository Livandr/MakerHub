package com.technobel.makerhub.repository;


import com.technobel.makerhub.models.entity.AuthUserRegister;
import com.technobel.makerhub.models.entity.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserRegisterRepository extends JpaRepository<AuthUserRegister, Long>{


}