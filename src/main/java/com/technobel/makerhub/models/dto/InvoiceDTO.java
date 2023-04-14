package com.technobel.makerhub.models.dto;

import com.technobel.makerhub.models.entity.Invoice;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class InvoiceDTO {
//    private static int invoiceCount = 0;
    private final Long id;
    private final int invoiceNumber;
    private final LocalDate invoiceDate;
    private final String invoiceDescription;
    private final double amountExclVat;
    private final double vat;
    private final double amountInclVat;
    private final LocalDate dueDate;
    private final String additionalNotes;

    public static InvoiceDTO toDto(Invoice entity){
        if(entity==null)
            return null;

        return new InvoiceDTO(
                entity.getId(),
                entity.getInvoiceNumber(),
                entity.getInvoiceDate(),
                entity.getInvoiceDescription(),
                entity.getAmountExclVat(),
                entity.getVat(),
                entity.getAmountInclVat(),
                entity.getDueDate(),
                entity.getAddtionalNotes()
        );

    }
}
