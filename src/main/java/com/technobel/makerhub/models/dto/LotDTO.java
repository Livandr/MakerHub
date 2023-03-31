package com.technobel.makerhub.models.dto;

import com.technobel.makerhub.models.entity.Lot;
import lombok.Builder;
import lombok.Data;

@Data@Builder
public class LotDTO {

    private Long id;
    private String reference;
    private String type;
    private String description;
    private int share;
    public static LotDTO toDTO(Lot entity) {
        if(entity == null)
            return null;

        return new LotDTO(
                entity.getId(),
                entity.getReference(),
                entity.getType(),
                entity.getDescription(),
                entity.getShare()
        );

    }

}
