package com.technobel.makerhub.services;

import com.technobel.makerhub.models.dto.SupplierDTO;
import com.technobel.makerhub.models.form.SupplierForm;
import com.technobel.makerhub.models.form.SupplierUpdateForm;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SupplierService {

    List<SupplierDTO> getAll();
    SupplierDTO getOne(Long id);

    void addSupplier(SupplierForm form);

    void updateSupplier(Long id, SupplierUpdateForm form);
    void removeSupplier(Long id);
}
