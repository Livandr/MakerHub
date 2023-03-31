package com.technobel.makerhub.controllers;

import com.technobel.makerhub.models.dto.SupplierDTO;
import com.technobel.makerhub.services.SupplierService;
import lombok.Getter;
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

    @GetMapping("/all")
    public List<SupplierDTO> getAll(){ return supplierService.getAll(); }
}
