package com.technobel.makerhub.models.dto;

import com.technobel.makerhub.models.entity.Address;
import com.technobel.makerhub.models.entity.BankAccountDetails;
import com.technobel.makerhub.models.entity.CoOwnership;
import lombok.Builder;
import lombok.Data;

import java.util.Set;
import java.util.stream.Collectors;

@Data
@Builder
public class CoOwnershipDTO {

    private final Long id;
    private final String bce;
    private final String name;
    private final Address address;
    private final BankAccountDetails currentBankAccount;
    private final BankAccountDetails savingBankAccount;
    private final BankAccountDetails otherBankAccount;
    private final Set<LotDTO> lots;
    private final Set<AccountDTO> accountDTOSet;
    private final Set<AuthUserDTO> authUserDTOSet;


    public static CoOwnershipDTO toDTO(CoOwnership entity){
        if(entity == null)
            return null;
        return new CoOwnershipDTO(
                entity.getId(),
                entity.getBce(),
                entity.getCoOwnershipName(),
                entity.getCoOwnershipAddress(),
                entity.getCurrentBankAccount(),
                entity.getSavingBankAccount(),
                entity.getOtherBankAccount(),
                entity.getCoOwnershipLots().stream()
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
