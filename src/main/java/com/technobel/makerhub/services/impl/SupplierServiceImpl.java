package com.technobel.makerhub.services.impl;

import com.technobel.makerhub.models.dto.SupplierDTO;
import com.technobel.makerhub.models.entity.Supplier;
import com.technobel.makerhub.models.form.SupplierForm;
import com.technobel.makerhub.repository.SupplierRepository;
import com.technobel.makerhub.services.SupplierService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository){
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<SupplierDTO> getAll() {
        return supplierRepository.findAll().stream()
                .map(SupplierDTO::toDTO)
                .toList();
    }

    @Override
    public SupplierDTO getOne(Long id) {
        return supplierRepository.findById(id)
                .map(SupplierDTO::toDTO)
                .orElseThrow( () -> new RuntimeException("supplier not found"));
    }

    @Override
    public void addSupplier(SupplierForm form) {
        Supplier supplier = form.toEntity();

        supplierRepository.save(supplier);
    }

    @Override
    public void updateSupplier(Long id, SupplierForm form) {
        Supplier supplier = supplierRepository.findById(id)
                .orElseThrow( () -> new RuntimeException("supplier not found"));

        supplier.setSupplierName(form.getSupplierName());
        supplier.setAddress(form.getSupplierAddress());
        supplier.setEmail(form.getEmail());
        supplier.setPhone(form.getPhone());
        supplier.setBankAccount(form.getBankAccount());

        supplierRepository.save(supplier);
    }

    @Override
    public void removeSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}
