package com.technobel.makerhub.repository;

import com.technobel.makerhub.models.entity.CustomerRegister;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRegisterRepository extends JpaRepository<CustomerRegister, Long> {
}
