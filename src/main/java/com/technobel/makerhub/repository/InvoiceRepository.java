package com.technobel.makerhub.repository;

import com.technobel.makerhub.models.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

//    Optional<Invoice> findByIdOrSupplierName(Long id, String name);
}
