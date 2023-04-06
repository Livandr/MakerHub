package com.technobel.makerhub.controllers;

import com.technobel.makerhub.models.dto.SupplierDTO;
import com.technobel.makerhub.models.form.SupplierForm;
import com.technobel.makerhub.models.form.SupplierUpdateForm;
import com.technobel.makerhub.services.SupplierService;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService){
        this.supplierService = supplierService;
    }

    //GET - http://localhost:8080/supplier/list
    @GetMapping("/list")
    public List<SupplierDTO> getAll(){ return supplierService.getAll(); }

    @GetMapping("/{id:[0-9]+}")
    public SupplierDTO displaySupplierDetails(@PathVariable long id){ return supplierService.getOne(id);}

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addSupplier(@RequestBody @Valid SupplierForm form){ supplierService.addSupplier(form);}

    @PutMapping("/{id:[0-9]+}/update")
    public void updateSupplier(@PathVariable long id, @RequestBody @Valid SupplierUpdateForm form){
        supplierService.updateSupplier(id, form);
    }

    @DeleteMapping("/{id:[0-9]+}")
    public void removeSupplier(@PathVariable long id){ supplierService.removeSupplier(id);}

}
