package com.technobel.makerhub.repository;

import com.technobel.makerhub.models.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
