package com.technobel.makerhub.services;

import com.technobel.makerhub.models.dto.SupplierDTO;
import com.technobel.makerhub.models.form.SupplierForm;
import com.technobel.makerhub.models.form.SupplierUpdateForm;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SupplierService {
    //CRUD
    //Afficher tous les fournisseurs
    List<SupplierDTO> getAll();
    //Afficher un fournisseur en particulier
    SupplierDTO getOne(Long id);
    //Ajouter
    void addSupplier(SupplierForm form);
    //Modifier
    void updateSupplier(Long id, SupplierUpdateForm form);
    //Supprimer
    void removeSupplier(Long id);
}
