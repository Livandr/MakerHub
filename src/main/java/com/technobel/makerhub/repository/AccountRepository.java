package com.technobel.makerhub.repository;

import com.technobel.makerhub.models.entity.accounts.Account;
import com.technobel.makerhub.models.entity.accounts.SupplierAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query("SELECT a FROM Account a WHERE (a.accountNumber>600000 AND  a.accountNumber<800000 AND a.debitBalance>0 ) ")
            List<Account> findChargesAndProducts();

    @Query("SELECT s FROM Account s WHERE (s.accountNumber>440000 AND s.accountNumber<441000  )")
            List<Account> findSuppliers();
}
