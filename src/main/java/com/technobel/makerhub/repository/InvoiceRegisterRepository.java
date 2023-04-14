package com.technobel.makerhub.repository;

import com.technobel.makerhub.models.entity.InvoiceRegister;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRegisterRepository extends JpaRepository<InvoiceRegister, Long> {
}