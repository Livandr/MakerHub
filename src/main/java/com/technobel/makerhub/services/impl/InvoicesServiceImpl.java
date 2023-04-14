package com.technobel.makerhub.services.impl;

import com.technobel.makerhub.models.dto.InvoiceDTO;
import com.technobel.makerhub.models.entity.Invoice;
import com.technobel.makerhub.models.entity.InvoiceRegister;
import com.technobel.makerhub.models.entity.InvoiceRegisterRepository;
import com.technobel.makerhub.models.form.InvoiceRegisterForm;
import com.technobel.makerhub.repository.InvoiceRepository;
import com.technobel.makerhub.services.InvoicesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoicesServiceImpl implements InvoicesService {

    private final InvoiceRepository repository;
    private final InvoiceRegisterRepository invoiceRegisterRepository;

    public InvoicesServiceImpl(InvoiceRepository repository,
                               InvoiceRegisterRepository invoiceRegisterRepository) {
        this.repository = repository;
        this.invoiceRegisterRepository = invoiceRegisterRepository;
    }


    @Override
    public List<InvoiceDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(InvoiceDTO::toDto)
                .toList();
    }

    @Override
    public InvoiceDTO getDetail(Long id) {
        return repository.findById(id)
                .map(InvoiceDTO::toDto)
                .orElseThrow( () -> new RuntimeException("invoice not found"));
    }

    @Override
    public void addInvoice(InvoiceRegisterForm form) {
        Invoice invoice = form.toEntity();
        repository.save(invoice);
    }



    @Override
    public void updateInvoice(Long id, InvoiceRegisterForm form) {

    }

    @Override
    public void deleteInvoice(Long id) {
        repository.deleteById(id);
    }
}
