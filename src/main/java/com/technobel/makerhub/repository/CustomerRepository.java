package com.technobel.makerhub.repository;

import com.technobel.makerhub.models.entity.CoOwnership;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CoOwnership, Long> {

     Optional<CoOwnership> findByIdOrCoOwnershipNameOrCoOwnershipAddress(Long id, String name, String addressName);
}
