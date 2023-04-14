package com.technobel.makerhub.models.form;

import com.technobel.makerhub.models.entity.CoOwnership;
import com.technobel.makerhub.models.entity.Invoice;
import com.technobel.makerhub.models.entity.Supplier;
import com.technobel.makerhub.models.entity.accounts.Account;
import com.technobel.makerhub.models.entity.accounts.SupplierAccount;
import lombok.Data;

import java.time.LocalDate;

@Data
public class InvoiceRegisterForm {

    private CoOwnership coOwnership;
    private LocalDate invoiceDate;
    private int invoiceNumber;
    private String invoiceDescription;
    private double amountExclVat;
    private double vat;
    private double amountInclVat = amountExclVat * (vat / 100);
    private SupplierAccount supplier;
    private Account inputAccount;
    private LocalDate dueDate;
    private String additionalNotes;

    public Invoice toEntity() {
        Invoice invoice = new Invoice();

        invoice.setCoOwnership(coOwnership);
        invoice.setInvoiceDate(invoiceDate);
        invoice.setInvoiceNumber(invoiceNumber);
        invoice.setInvoiceDescription(invoiceDescription);
        invoice.setAmountExclVat(amountExclVat);
        invoice.setVat(vat);
        invoice.setAmountInclVat(amountInclVat);
        invoice.setDueDate(dueDate);
        invoice.setAddtionalNotes(additionalNotes);

        return invoice;
    }
}
