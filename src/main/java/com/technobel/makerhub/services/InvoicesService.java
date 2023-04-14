package com.technobel.makerhub.services;

import com.technobel.makerhub.models.dto.InvoiceDTO;
import com.technobel.makerhub.models.form.InvoiceRegisterForm;

import java.util.List;

public interface InvoicesService {

    List<InvoiceDTO> getAll();

    InvoiceDTO getDetail(Long Id);

    void addInvoice(InvoiceRegisterForm form);
    void updateInvoice(Long id, InvoiceRegisterForm form);
    void deleteInvoice(Long id);
}
