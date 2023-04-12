package com.technobel.makerhub.services.impl;

import com.technobel.makerhub.models.dto.CustomerDTO;
import com.technobel.makerhub.models.entity.CoOwnership;
import com.technobel.makerhub.models.entity.CustomerRegister;
import com.technobel.makerhub.models.form.CustomerRegisterForm;
import com.technobel.makerhub.repository.CustomerRegisterRepository;
import com.technobel.makerhub.repository.CustomerRepository;
import com.technobel.makerhub.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerRegisterRepository customerRegisterRepository;

    public CustomerImpl(CustomerRepository customerRepository,
                        CustomerRegisterRepository customerRegisterRepository) {
        this.customerRepository = customerRepository;
        this.customerRegisterRepository = customerRegisterRepository;
    }

    @Override
    public List<CustomerDTO> getAll() {
        return customerRepository.findAll()
                .stream()
                .map(CustomerDTO::toDTO)
                .toList();
    }

    @Override
    public CustomerDTO getOne(Long id) {
        return customerRepository.findById(id)
                .map(CustomerDTO::toDTO)
                .orElseThrow ( () -> new RuntimeException("customer not found"));
    }

    @Override
    public void addCustomer(CustomerRegisterForm form) {
        CustomerRegister coOwnership = form.toEntity();
        customerRegisterRepository.save(coOwnership);
    }

    @Override
    public void updateCustomer(long id, CustomerRegisterForm form) {
        CustomerRegister coOwnership = customerRegisterRepository.findById(id)
                .orElseThrow( () -> new RuntimeException("customer not found"));

        customerRegisterRepository.save(coOwnership);

    }

    @Override
    public void removeCustomer(long id) {
        customerRepository.deleteById(id);
    }


}
