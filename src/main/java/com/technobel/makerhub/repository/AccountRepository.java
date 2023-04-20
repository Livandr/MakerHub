package com.technobel.makerhub.repository;

import com.technobel.makerhub.models.entity.accounts.Account;
import com.technobel.makerhub.models.entity.accounts.ProductAccount;
import com.technobel.makerhub.models.entity.accounts.SupplierAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    // REQUÊTE POUR SÉLECTIONNER TOUS LES COMPTES DE CHARGE ET LES COMPTES DE PRODUIT
    @Query("SELECT a FROM Account a WHERE ( a.accountNumber>600000  AND a.accountNumber<750000) ")
            List<Account> findChargesAndProducts();

    // REQUÊTE POUR SELECTIONNER TOUS LES COMPTES FOURNISSEUR
    @Query("SELECT s FROM Account s WHERE (s.accountNumber>440000 AND s.accountNumber<443999)")
            List<Account> findSuppliers();
}
