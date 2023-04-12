package com.technobel.makerhub.models.dto;

import com.technobel.makerhub.models.entity.Address;
import com.technobel.makerhub.models.entity.BankAccountDetails;
import com.technobel.makerhub.models.entity.CoOwnership;
import com.technobel.makerhub.models.entity.users.CoOwner;
import lombok.Builder;
import lombok.Data;

import java.util.Set;
import java.util.stream.Collectors;

@Data
@Builder
public class CustomerDTO {

    private final Long id;
    private final String bce;
    private final String coOName;
    private final String coOStreetName;
    private final String coOStreetNumber;
    private final String coOStreetBoxNumber;
    private final int coOPostalCode;
    private final String coOCity;
    private final String coOBankDetailIBAN;
    private final String coOBankDetailBIC;
    private final Set<LotDTO> lots;
    private final Set<AccountDTO> accountDTOSet;
    private final Set<AuthUserDTO> coOwners;


    public static CustomerDTO toDTO(CoOwnership entity){
        if(entity == null)
            return null;

        return new CustomerDTO(
                entity.getId(),
                entity.getBce(),
                entity.getCoOwnershipName(),
                entity.getCoOwnershipAddressName(),
                entity.getCoOwnershipAddressNumber(),
                entity.getCoOwnershipAddressBoxNumber(),
                entity.getCoOwnershipPostalCode(),
                entity.getCoOwnershipCity(),
                entity.getBankDetailBIC(),
                entity.getBankDetailIBAN(),
                entity.getLots().stream()
                        .map(LotDTO::toDTO)
                        .collect(Collectors.toSet()),
                entity.getAccountSet().stream()
                        .map(AccountDTO::toDto)
                        .collect(Collectors.toSet()),
                entity.getCoOwners().stream()
                        .map(AuthUserDTO::toDto)
                        .collect(Collectors.toSet())

        );
    }




}
