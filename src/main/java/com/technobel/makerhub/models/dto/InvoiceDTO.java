package com.technobel.makerhub.models.dto;

import com.technobel.makerhub.models.entity.Invoice;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class InvoiceDTO {
    private final Long id;
    private final LocalDate invoiceDate;
    private final double amountExclVat;
    private final int vat;
    private final double amountInclVat;
    private final LocalDate dueDate;

    public static InvoiceDTO toDto(Invoice entity){
        if(entity==null)
            return null;

        return new InvoiceDTO(
                entity.getId(),
                entity.getInvoiceDate(),
                entity.getAmountExclVat(),
                entity.getVat(),
                entity.getAmountInclVat(),
                entity.getDueDate()
        );

    }
}
