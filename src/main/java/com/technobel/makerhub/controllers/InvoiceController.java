package com.technobel.makerhub.controllers;

import com.technobel.makerhub.models.dto.InvoiceDTO;
import com.technobel.makerhub.models.form.InvoiceRegisterForm;
import com.technobel.makerhub.repository.InvoiceRepository;
import com.technobel.makerhub.services.InvoicesService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/invoice")
public class InvoiceController {

    private final InvoicesService invoicesService;


    public InvoiceController(InvoicesService invoicesService) {
        this.invoicesService = invoicesService;
    }

    @GetMapping("/all")
    public List<InvoiceDTO> getAll(){
        return invoicesService.getAll();
    }

    @GetMapping("/details/{id:[0-9]+}")
    public InvoiceDTO getDetails(@PathVariable long id){return invoicesService.getDetails(id);}

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addInvoice (@RequestBody @Valid InvoiceRegisterForm form){
        invoicesService.addInvoice(form);
    }

}
