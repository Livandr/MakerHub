package com.technobel.makerhub.services;

import com.technobel.makerhub.models.dto.AccountDTO;
import com.technobel.makerhub.models.entity.accounts.Account;
import com.technobel.makerhub.models.form.AccountInsertForm;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {

    // AFFICHAGE DE TOUS LES COMPTES DE LA BASE DONNÉES
    List<AccountDTO> getAll();

    // AFFICHAGE DES COMPTES DE CHARGES ET DE PRODUITS (CLASSE 6 ET 7)
    List<AccountDTO> getChargesAndProducts();

    // AFFICHAGE DES COMPTES FOURNISSEUR (CLASSE 4 -> 440001 > 449999)
    List<AccountDTO> getSuppliers();

    //===============================================================

    // AFFICHAGE D'UN COMPTE EN PARTICULIER
    AccountDTO getOne(Long id);

    // CRÉATION D'UN COMPTE VIA UN FORMULAIRE
    void addAccount(AccountInsertForm form);

    // MODIFICATION D'UN COMPTE VIA UN FORMULAIRE
    void updateAccount(Long id, AccountInsertForm form);

    // SUPPRESSION D'UN COMPTE
    void removeAccount(Long id);
//    List<Account> createAccountsList();
}
