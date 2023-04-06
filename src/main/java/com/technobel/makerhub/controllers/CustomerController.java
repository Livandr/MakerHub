package com.technobel.makerhub.controllers;

import com.technobel.makerhub.models.dto.CustomerDTO;
import com.technobel.makerhub.models.form.CustomerRegisterForm;
import com.technobel.makerhub.services.CustomerService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;



    public CustomerController(CustomerService customerService){ this.customerService = customerService;}
    @GetMapping("/list")
    public List<CustomerDTO> getAll(){ return customerService.getAll();}

    @GetMapping("/details/{id:[0-9]+}")
    public CustomerDTO displayCustomerDetails(@PathVariable long id){ return  customerService.getOne(id);}

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addCustomer (@RequestBody @Valid CustomerRegisterForm form){ customerService.addCustomer(form);}

    @PutMapping("/{id:[0-9]+}/update")
    public void updateCustomer(@PathVariable long id, @RequestBody @Valid CustomerRegisterForm form){
        customerService.updateCustomer(id, form);
    }

    @DeleteMapping("/{id:[0-9]+}")
    public void removeCustomer(@PathVariable long id){ customerService.removeCustomer(id);}
}
