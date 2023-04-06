package com.technobel.makerhub.services;

import com.technobel.makerhub.models.dto.CustomerDTO;
import com.technobel.makerhub.models.form.CustomerRegisterForm;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getAll();

    CustomerDTO getOne(Long id);
    void addCustomer(CustomerRegisterForm form);

    void updateCustomer(long id, CustomerRegisterForm form);

    void removeCustomer(long id);
}
