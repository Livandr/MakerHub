package com.technobel.makerhub.utils;

import com.technobel.makerhub.models.entity.CoOwnership;
import com.technobel.makerhub.models.entity.Supplier;
import com.technobel.makerhub.models.entity.accounts.*;
import com.technobel.makerhub.models.entity.users.Admin;
import com.technobel.makerhub.repository.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class DataInit implements InitializingBean {
    private final CustomerRegisterRepository customerRegisterRepository;
    private final AuthUserRepository authUserRepository;
    private final AccountRepository accountRepository;
    private final SupplierRepository supplierRepository;
    private final CustomerRepository customerRepository;


    public DataInit(
            SupplierRepository supplierRepository,
            AuthUserRepository authUserRepository,
            CustomerRegisterRepository customerRegisterRepository,
            AccountRepository accountRepository, CustomerRepository customerRepository
            ){
        this.supplierRepository = supplierRepository;
        this.authUserRepository = authUserRepository;
        this.customerRegisterRepository = customerRegisterRepository;
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("-- INITIALIZING DB DATA --");

        //ACCOUNTS
        Account account1 = new BalanceSheetAccount();
        Account account2 = new BalanceSheetAccount();
        Account account3 = new BalanceSheetAccount();
        Account account4 = new BalanceSheetAccount();
        Account account5 = new BalanceSheetAccount();
        Account account6 = new BalanceSheetAccount();
        Account account7 = new BalanceSheetAccount();
        Account account8 = new BalanceSheetAccount();
        Account account9 = new BalanceSheetAccount();
        Account account10 = new BalanceSheetAccount();
        Account account11 = new BalanceSheetAccount();
        Account account12 = new BalanceSheetAccount();
        Account account13 = new BalanceSheetAccount();
        Account account14 = new BalanceSheetAccount();
        Account account15 = new BankAccount();
        Account account16 = new BankAccount();
        Account account17 = new BalanceSheetAccount();
        Account account18 = new ChargeAccount();
        Account account19 = new ChargeAccount();
        Account account20 = new ChargeAccount();
        Account account21 = new ChargeAccount();
        Account account22 = new ChargeAccount();
        Account account23 = new ChargeAccount();
        Account account24 = new ChargeAccount();
        Account account25 = new ChargeAccount();
        Account account26 = new ChargeAccount();
        Account account27 = new ChargeAccount();
        Account account28 = new ChargeAccount();
        Account account29 = new ChargeAccount();
        Account account30 = new ChargeAccount();
        Account account31 = new ChargeAccount();
        Account account32 = new ChargeAccount();
        Account account33 = new ChargeAccount();
        Account account34 = new ChargeAccount();
        Account account35 = new ChargeAccount();
        Account account36 = new ChargeAccount();
        Account account37 = new ChargeAccount();
        Account account38 = new ChargeAccount();
        Account account39 = new ChargeAccount();
        Account account40 = new ChargeAccount();
        Account account41 = new ChargeAccount();
        Account account42 = new ChargeAccount();
        Account account43 = new ChargeAccount();
        Account account44 = new ChargeAccount();
        Account account45 = new ChargeAccount();
        Account account46 = new ChargeAccount();
        Account account47 = new ChargeAccount();
        Account account48 = new ChargeAccount();
        Account account49 = new ChargeAccount();
        Account account50 = new ChargeAccount();
        Account account51 = new ChargeAccount();
        Account account52 = new ChargeAccount();
        Account account53 = new ChargeAccount();
        Account account54 = new ChargeAccount();
        Account account55 = new ChargeAccount();
        Account account56 = new ChargeAccount();
        Account account57 = new ChargeAccount();
        Account account58 = new ChargeAccount();
        Account account59 = new ChargeAccount();
        Account account60 = new ChargeAccount();
        Account account61 = new ChargeAccount();
        Account account62 = new ChargeAccount();
        Account account63 = new ChargeAccount();
        Account account64 = new ChargeAccount();
        Account account65 = new ChargeAccount();
        Account account66 = new ChargeAccount();
        Account account67 = new ChargeAccount();
        Account account68 = new ChargeAccount();
        Account account69 = new ChargeAccount();
        Account account70 = new ChargeAccount();
        Account account71 = new ChargeAccount();
        Account account72 = new ChargeAccount();
        Account account73 = new ChargeAccount();
        Account account74 = new ChargeAccount();
        Account account75 = new ChargeAccount();
        Account account76 = new ChargeAccount();
        Account account77 = new ChargeAccount();
        Account account78 = new ChargeAccount();
        Account account79 = new ChargeAccount();
        Account account80 = new ChargeAccount();
        Account account81 = new SupplierAccount();
        Account account82 = new SupplierAccount();
        Account account83 = new SupplierAccount();
        Account account84 = new SupplierAccount();
        Account account85 = new SupplierAccount();
        Account account86 = new SupplierAccount();
        Account account87 = new SupplierAccount();
        Account account88 = new SupplierAccount();
        Account account89 = new SupplierAccount();
        Account account90 = new SupplierAccount();
        Account account91 = new SupplierAccount();
        Account account92 = new SupplierAccount();
        Account account93 = new SupplierAccount();
        Account account94 = new SupplierAccount();
        Account account95 = new SupplierAccount();
        Account account96 = new SupplierAccount();
        Account account97 = new SupplierAccount();
        Account account98 = new SupplierAccount();
        Account account99 = new SupplierAccount();
        Account account100 = new SupplierAccount();

        account1.setAccountId(1L);
        account1.setAccountNumber(100000);
        account1.setAccountTitle("Fonds de roulement");
        account1.setDebitBalance(0.0);
        account1.setCreditBalance(16000.0);

        account2.setAccountId(2L);
        account2.setAccountNumber(130000);
        account2.setAccountTitle("Fonds de réserve");
        account2.setDebitBalance(0.0);
        account2.setCreditBalance(26572.90);

        account3.setAccountId(3L);
        account3.setAccountNumber(131000);
        account3.setAccountTitle("Fonds travaux");
        account3.setDebitBalance(0.0);
        account3.setCreditBalance(8592.97);

        account4.setAccountId(4L);
        account4.setAccountNumber(173000);
        account4.setAccountTitle("Établissement de crédit");
        account4.setDebitBalance(0.0);
        account4.setCreditBalance(0.0);

        account5.setAccountId(5L);
        account5.setAccountNumber(230000);
        account5.setAccountTitle("Installations, machines et outillage");
        account5.setDebitBalance(0.0);
        account5.setCreditBalance(0.0);

        account6.setAccountId(6L);
        account6.setAccountNumber(240000);
        account6.setAccountTitle("Mobilier et matériel roulant");
        account6.setDebitBalance(0.0);
        account6.setCreditBalance(0.0);

        account7.setAccountId(7L);
        account7.setAccountNumber(416000);
        account7.setAccountTitle("Créances diverses");
        account7.setDebitBalance(0.0);
        account7.setCreditBalance(0.0);

        account8.setAccountId(8L);
        account8.setAccountNumber(423000);
        account8.setAccountTitle("Établissement de crédit");
        account8.setDebitBalance(0.0);
        account8.setCreditBalance(0.0);

        account9.setAccountId(9L);
        account9.setAccountNumber(444000);
        account9.setAccountTitle("Factures à recevoir");
        account9.setDebitBalance(0.0);
        account9.setCreditBalance(0.0);

        account10.setAccountId(10L);
        account10.setAccountNumber(460000);
        account10.setAccountTitle("Provisions pour charges");
        account10.setDebitBalance(0.0);
        account10.setCreditBalance(0.0);

        account11.setAccountId(11L);
        account11.setAccountNumber(490000);
        account11.setAccountTitle("Charge à reporter");
        account11.setDebitBalance(0.0);
        account11.setCreditBalance(0.0);

        account12.setAccountId(12L);
        account12.setAccountNumber(492000);
        account12.setAccountTitle("Charge à imputer");
        account12.setDebitBalance(0.0);
        account12.setCreditBalance(0.0);

        account13.setAccountId(13L);
        account13.setAccountNumber(499000);
        account13.setAccountTitle("Compte d'attente");
        account13.setDebitBalance(0.0);
        account13.setCreditBalance(0.0);

        account14.setAccountId(14L);
        account14.setAccountNumber(499100);
        account14.setAccountTitle("Arrondis");
        account14.setDebitBalance(0.0);
        account14.setCreditBalance(0.0);

        account15.setAccountId(15L);
        account15.setAccountNumber(550000);
        account15.setAccountTitle("Fonds de réserve");
        account15.setDebitBalance(27515.59);
        account15.setCreditBalance(0.0);

        account16.setAccountId(16L);
        account16.setAccountNumber(551000);
        account16.setAccountTitle("Fonds de roulement");
        account16.setDebitBalance(15779.51);
        account16.setCreditBalance(0.0);

        account17.setAccountId(17L);
        account17.setAccountNumber(580000);
        account17.setAccountTitle("Virements émis");
        account17.setDebitBalance(0.0);
        account17.setCreditBalance(0.0);

        account18.setAccountId(18L);
        account18.setAccountNumber(610000);
        account18.setAccountTitle("Contrat entretien (anti-incendie)");
        account18.setDebitBalance(0.0);
        account18.setCreditBalance(0.0);

        account19.setAccountId(19L);
        account19.setAccountNumber(610010);
        account19.setAccountTitle("Extincteurs d'incendie");
        account19.setDebitBalance(0.0);
        account19.setCreditBalance(0.0);

        account20.setAccountId(20L);
        account20.setAccountNumber(610100);
        account20.setAccountTitle("Contrôle ascenseurs");
        account20.setDebitBalance(530.0);
        account20.setCreditBalance(0.0);

        account21.setAccountId(21L);
        account21.setAccountNumber(610110);
        account21.setAccountTitle("Entretien ascenseurs");
        account21.setDebitBalance(2480.0);
        account21.setCreditBalance(0.0);

        account22.setAccountId(22L);
        account22.setAccountNumber(610120);
        account22.setAccountTitle("Entretien et réparations ascenseurs");
        account22.setDebitBalance(0.0);
        account22.setCreditBalance(0.0);

        account23.setAccountId(23L);
        account23.setAccountNumber(610130);
        account23.setAccountTitle("Téléphone d'urgence");
        account23.setDebitBalance(490.0);
        account23.setCreditBalance(0.0);

        account24.setAccountId(24L);
        account24.setAccountNumber(610140);
        account24.setAccountTitle("Travaux d'adaptation ascenseur");
        account24.setDebitBalance(0.0);
        account24.setCreditBalance(0.0);

        account25.setAccountId(25L);
        account25.setAccountNumber(610150);
        account25.setAccountTitle("Autres charges ascenseurs");
        account25.setDebitBalance(0.0);
        account25.setCreditBalance(0.0);

        account26.setAccountId(26L);
        account26.setAccountNumber(610151);
        account26.setAccountTitle("Autres charges ascenseurs");
        account26.setDebitBalance(0.0);
        account26.setCreditBalance(0.0);

        account27.setAccountId(27L);
        account27.setAccountNumber(610230);
        account27.setAccountTitle("Entretien sonnettes et parlophones/videophones");
        account27.setDebitBalance(0.0);
        account27.setCreditBalance(0.0);

        account28.setAccountId(28L);
        account28.setAccountNumber(610270);
        account28.setAccountTitle("Extracteurs d'air et de fumée");
        account28.setDebitBalance(0.0);
        account28.setCreditBalance(0.0);

        account29.setAccountId(29L);
        account29.setAccountNumber(610300);
        account29.setAccountTitle("Contrôle des installations");
        account29.setDebitBalance(0.0);
        account29.setCreditBalance(0.0);

        account30.setAccountId(30L);
        account30.setAccountNumber(610310);
        account30.setAccountTitle("Contrat d'entretien chaudière");
        account30.setDebitBalance(1900.0);
        account30.setCreditBalance(0.0);

        account31.setAccountId(31L);
        account31.setAccountNumber(610320);
        account31.setAccountTitle("Autre entretien installations de chauffage");
        account31.setDebitBalance(0.0);
        account31.setCreditBalance(0.0);

        account32.setAccountId(32L);
        account32.setAccountNumber(610340);
        account32.setAccountTitle("Autre entretien adoucisseur d'eau et traitement de l'eau");
        account32.setDebitBalance(0.0);
        account32.setCreditBalance(0.0);

        account33.setAccountId(33L);
        account33.setAccountNumber(610350);
        account33.setAccountTitle("Autre entretien conduites de chauffage");
        account33.setDebitBalance(0.0);
        account33.setCreditBalance(0.0);

        account34.setAccountId(34L);
        account34.setAccountNumber(610360);
        account34.setAccountTitle("Autre entretien conduites d'eau");
        account34.setDebitBalance(0.0);
        account34.setCreditBalance(0.0);

        account35.setAccountId(35L);
        account35.setAccountNumber(610370);
        account35.setAccountTitle("Autre entretien évacuation, égouts et installation de pompage");
        account35.setDebitBalance(0.0);
        account35.setCreditBalance(0.0);

        account36.setAccountId(36L);
        account36.setAccountNumber(610380);
        account36.setAccountTitle("Compteurs et relevé compteurs");
        account36.setDebitBalance(600.0);
        account36.setCreditBalance(0.0);

        account37.setAccountId(37L);
        account37.setAccountNumber(610400);
        account37.setAccountTitle("Contrat d'entretien menuiseries");
        account37.setDebitBalance(0.0);
        account37.setCreditBalance(0.0);

        account38.setAccountId(38L);
        account38.setAccountNumber(610410);
        account38.setAccountTitle("Entretien porte de garage");
        account38.setDebitBalance(1200.0);
        account38.setCreditBalance(0.0);

        account39.setAccountId(39L);
        account39.setAccountNumber(610500);
        account39.setAccountTitle("Nettoyage bâtiment selon contrat");
        account39.setDebitBalance(7500.0);
        account39.setCreditBalance(0.0);

        account40.setAccountId(40L);
        account40.setAccountNumber(610510);
        account40.setAccountTitle("Nettoyage bâtiment autres");
        account40.setDebitBalance(0.0);
        account40.setCreditBalance(0.0);

        account41.setAccountId(41L);
        account41.setAccountNumber(610520);
        account41.setAccountTitle("Produits entretien nettoyage");
        account41.setDebitBalance(0.0);
        account41.setCreditBalance(0.0);

        account42.setAccountId(42L);
        account42.setAccountNumber(610530);
        account42.setAccountTitle("Matériel entretien nettoyage");
        account42.setDebitBalance(0.0);
        account42.setCreditBalance(0.0);

        account43.setAccountId(43L);
        account43.setAccountNumber(610540);
        account43.setAccountTitle("Ordures ménagères/PMC/Papier et verre selon contrat");
        account43.setDebitBalance(368.0);
        account43.setCreditBalance(0.0);

        account44.setAccountId(44L);
        account44.setAccountNumber(610550);
        account44.setAccountTitle("Ordures ménagères/PMC/Papier et verre autres");
        account44.setDebitBalance(0.0);
        account44.setCreditBalance(0.0);

        account45.setAccountId(45L);
        account45.setAccountNumber(610580);
        account45.setAccountTitle("Autres");
        account45.setDebitBalance(0.0);
        account45.setCreditBalance(0.0);

        account46.setAccountId(46L);
        account46.setAccountNumber(610600);
        account46.setAccountTitle("Entretien jardins et environs immédiats selon contrat");
        account46.setDebitBalance(1100.0);
        account46.setCreditBalance(0.0);

        account47.setAccountId(47L);
        account47.setAccountNumber(610610);
        account47.setAccountTitle("Autre entretien jardins et environs immédiats");
        account47.setDebitBalance(0.0);
        account47.setCreditBalance(0.0);

        account48.setAccountId(48L);
        account48.setAccountNumber(610620);
        account48.setAccountTitle("Aménagement jardins et environs immédiats selon contrat");
        account48.setDebitBalance(0.0);
        account48.setCreditBalance(0.0);

        account49.setAccountId(49L);
        account49.setAccountNumber(610660);
        account49.setAccountTitle("Travaux divers");
        account49.setDebitBalance(0.0);
        account49.setCreditBalance(0.0);

        account50.setAccountId(50L);
        account50.setAccountNumber(610730);
        account50.setAccountTitle("Entretien toits");
        account50.setDebitBalance(1720.0);
        account50.setCreditBalance(0.0);

        account51.setAccountId(51L);
        account51.setAccountNumber(610740);
        account51.setAccountTitle("Entretien cheminées et canaux de ventilation");
        account51.setDebitBalance(0.0);
        account51.setCreditBalance(0.0);

        account52.setAccountId(52L);
        account52.setAccountNumber(610750);
        account52.setAccountTitle("Entretien caves");
        account52.setDebitBalance(0.0);
        account52.setCreditBalance(0.0);

        account53.setAccountId(53L);
        account53.setAccountNumber(610900);
        account53.setAccountTitle("Contrat d'entretien");
        account53.setDebitBalance(0.0);
        account53.setCreditBalance(0.0);

        account53.setAccountId(53L);
        account53.setAccountNumber(610900);
        account53.setAccountTitle("Contrat d'entretien");
        account53.setDebitBalance(0.0);
        account53.setCreditBalance(0.0);

        account54.setAccountId(54L);
        account54.setAccountNumber(611111);
        account54.setAccountTitle("Rénovation");
        account54.setDebitBalance(8630.0);
        account54.setCreditBalance(0.0);

        account55.setAccountId(55L);
        account55.setAccountNumber(612010);
        account55.setAccountTitle("Eau Redevance et consommation");
        account55.setDebitBalance(9543.0);
        account55.setCreditBalance(0.0);

        account56.setAccountId(56L);
        account56.setAccountNumber(612020);
        account56.setAccountTitle("Sel pour adoucisseur d'eau");
        account56.setDebitBalance(410.60);
        account56.setCreditBalance(0.0);

        account57.setAccountId(57L);
        account57.setAccountNumber(612030);
        account57.setAccountTitle("Autres fournitures pour adoucisseur d'eau");
        account57.setDebitBalance(625.05);
        account57.setCreditBalance(0.0);

        account58.setAccountId(58L);
        account58.setAccountNumber(612110);
        account58.setAccountTitle("Électricité parties communes");
        account58.setDebitBalance(12230.45);
        account58.setCreditBalance(0.0);

        account59.setAccountId(59L);
        account59.setAccountNumber(612120);
        account59.setAccountTitle("Électricité ascenseurs");
        account59.setDebitBalance(0.0);
        account59.setCreditBalance(0.0);

        account60.setAccountId(60L);
        account60.setAccountNumber(612130);
        account60.setAccountTitle("Électricité chauffage et sanitaires");
        account60.setDebitBalance(0.0);
        account60.setCreditBalance(0.0);

        account61.setAccountId(61L);
        account61.setAccountNumber(612200);
        account61.setAccountTitle("Gaz Redevance et consommation");
        account61.setDebitBalance(8539.04);
        account61.setCreditBalance(0.0);

        account62.setAccountId(62L);
        account62.setAccountNumber(612320);
        account62.setAccountTitle("Livraison Mazout");
        account62.setDebitBalance(0.0);
        account62.setCreditBalance(0.0);

        account63.setAccountId(63L);
        account63.setAccountNumber(612400);
        account63.setAccountTitle("Câblodistribution");
        account63.setDebitBalance(759.80);
        account63.setCreditBalance(0.0);

        account64.setAccountId(64L);
        account64.setAccountNumber(613000);
        account64.setAccountTitle("Honoraires syndic");
        account64.setDebitBalance(4600.59);
        account64.setCreditBalance(0.0);

        account65.setAccountId(65L);
        account65.setAccountNumber(613010);
        account65.setAccountTitle("Honoraires avocats");
        account65.setDebitBalance(680.80);
        account65.setCreditBalance(0.0);

        account66.setAccountId(66L);
        account66.setAccountNumber(613020);
        account66.setAccountTitle("Honoraires architectes/ingénieurs");
        account66.setDebitBalance(4216.22);
        account66.setCreditBalance(0.0);

        account67.setAccountId(67L);
        account67.setAccountNumber(613030);
        account67.setAccountTitle("Honoraires experts");
        account67.setDebitBalance(0.0);
        account67.setCreditBalance(0.0);

        account68.setAccountId(68L);
        account68.setAccountNumber(613040);
        account68.setAccountTitle("Honoraires vérificateur externes aux comptes");
        account68.setDebitBalance(744.84);
        account68.setCreditBalance(0.0);

        account69.setAccountId(69L);
        account69.setAccountNumber(613100);
        account69.setAccountTitle("Indemnités membres du conseil de copropriété");
        account69.setDebitBalance(0.0);
        account69.setCreditBalance(0.0);

        account70.setAccountId(70L);
        account70.setAccountNumber(613120);
        account70.setAccountTitle("Autres charges conseil de copropriété");
        account70.setDebitBalance(0.0);
        account70.setCreditBalance(0.0);

        account71.setAccountId(71L);
        account71.setAccountNumber(614000);
        account71.setAccountTitle("Assurance incendie");
        account71.setDebitBalance(15423.09);
        account71.setCreditBalance(0.0);

        account72.setAccountId(72L);
        account72.setAccountNumber(614410);
        account72.setAccountTitle("Assurance Responsabilité civile");
        account72.setDebitBalance(0.0);
        account72.setCreditBalance(0.0);

        account73.setAccountId(73L);
        account73.setAccountNumber(614420);
        account73.setAccountTitle("Assurance Accidents du travail");
        account73.setDebitBalance(0.0);
        account73.setCreditBalance(0.0);

        account74.setAccountId(74L);
        account74.setAccountNumber(614440);
        account74.setAccountTitle("Assurance membres du conseil et vérificateur aux comptes");
        account74.setDebitBalance(0.0);
        account74.setCreditBalance(0.0);

        account75.setAccountId(75L);
        account75.setAccountNumber(614600);
        account75.setAccountTitle("Assurance judiciaire");
        account75.setDebitBalance(727.54);
        account75.setCreditBalance(0.0);

        account76.setAccountId(76L);
        account76.setAccountNumber(614700);
        account76.setAccountTitle("Franchise");
        account76.setDebitBalance(0.0);
        account76.setCreditBalance(0.0);

        account77.setAccountId(77L);
        account77.setAccountNumber(615000);
        account77.setAccountTitle("Conciergerie Téléphone - internet - GSM");
        account77.setDebitBalance(0.0);
        account77.setCreditBalance(0.0);

        account78.setAccountId(78L);
        account78.setAccountNumber(615100);
        account78.setAccountTitle("Électricité conciergerie");
        account78.setDebitBalance(0.0);
        account78.setCreditBalance(0.0);

        account79.setAccountId(79L);
        account79.setAccountNumber(615400);
        account79.setAccountTitle("Chauffage conciergerie");
        account79.setDebitBalance(0.0);
        account79.setCreditBalance(0.0);

        account80.setAccountId(80L);
        account80.setAccountNumber(616000);
        account80.setAccountTitle("Frais d'administration syndic");
        account80.setDebitBalance(0.0);
        account80.setCreditBalance(0.0);

        account81.setAccountId(81L);
        account81.setAccountNumber(440001);
        account81.setAccountTitle("Total Energies");
        account81.setDebitBalance(0.0);
        account81.setCreditBalance(16310.50);

        account82.setAccountId(82L);
        account82.setAccountNumber(440002);
        account82.setAccountTitle("Voo");
        account82.setDebitBalance(0.0);
        account82.setCreditBalance(759.80);

        account83.setAccountId(83L);
        account83.setAccountNumber(440003);
        account83.setAccountTitle("Kone");
        account83.setDebitBalance(0.0);
        account83.setCreditBalance(920.56);

        account84.setAccountId(84L);
        account84.setAccountNumber(440004);
        account84.setAccountTitle("Proximus");
        account84.setDebitBalance(0.0);
        account84.setCreditBalance(115.94);

        account85.setAccountId(85L);
        account85.setAccountNumber(440005);
        account85.setAccountTitle("Axa Assurances");
        account85.setDebitBalance(0.0);
        account85.setCreditBalance(4780.60);

        account86.setAccountId(86L);
        account86.setAccountNumber(440006);
        account86.setAccountTitle("Stima Belgium");
        account86.setDebitBalance(0.0);
        account86.setCreditBalance(1524.05);

        account87.setAccountId(87L);
        account87.setAccountNumber(440007);
        account87.setAccountTitle("Vivaqua");
        account87.setDebitBalance(0.0);
        account87.setCreditBalance(6698.96);

        account88.setAccountId(88L);
        account88.setAccountNumber(440008);
        account88.setAccountTitle("SD Worx");
        account88.setDebitBalance(0.0);
        account88.setCreditBalance(1078.97);

        account89.setAccountId(89L);
        account89.setAccountNumber(440009);
        account89.setAccountTitle("BWT");
        account89.setDebitBalance(0.0);
        account89.setCreditBalance(625.05);

        account90.setAccountId(90L);
        account90.setAccountNumber(440010);
        account90.setAccountTitle("Mensura");
        account90.setDebitBalance(0.0);
        account90.setCreditBalance(224.20);

        account91.setAccountId(91L);
        account91.setAccountNumber(440011);
        account91.setAccountTitle("Decourles Carla");
        account91.setDebitBalance(0.0);
        account91.setCreditBalance(2449.20);

        account92.setAccountId(92L);
        account92.setAccountNumber(440012);
        account92.setAccountTitle("Atout Corde");
        account92.setDebitBalance(0.0);
        account92.setCreditBalance(4780.67);

        account93.setAccountId(93L);
        account93.setAccountNumber(440013);
        account93.setAccountTitle("Lexel & Associés");
        account93.setDebitBalance(0.0);
        account93.setCreditBalance(680.80);

        account94.setAccountId(94L);
        account94.setAccountNumber(440014);
        account94.setAccountTitle("City Façade");
        account94.setDebitBalance(0.0);
        account94.setCreditBalance(1430.90);

        account95.setAccountId(95L);
        account95.setAccountNumber(440015);
        account95.setAccountTitle("Home Cleaning Service");
        account95.setDebitBalance(200.56);
        account95.setCreditBalance(0.0);

        account96.setAccountId(96L);
        account96.setAccountNumber(440016);
        account96.setAccountTitle("Animal Pest Control");
        account96.setDebitBalance(0.0);
        account96.setCreditBalance(358.20);

        account97.setAccountId(97L);
        account97.setAccountNumber(440017);
        account97.setAccountTitle("Finance Spirit");
        account97.setDebitBalance(0.0);
        account97.setCreditBalance(720.04);

        account98.setAccountId(98L);
        account98.setAccountNumber(440018);
        account98.setAccountTitle("M.G. Électricité");
        account98.setDebitBalance(0.0);
        account98.setCreditBalance(110.04);

        account99.setAccountId(99L);
        account99.setAccountNumber(440019);
        account99.setAccountTitle("Prodetec");
        account99.setDebitBalance(0.0);
        account99.setCreditBalance(1183.33);

        account100.setAccountId(100L);
        account100.setAccountNumber(440020);
        account100.setAccountTitle("C.P.M Garden sprl");
        account99.setDebitBalance(0.0);
        account99.setCreditBalance(730.33);


        account1 = accountRepository.save(account1);
        account2 = accountRepository.save(account2);
        account3 = accountRepository.save(account3);
        account4 = accountRepository.save(account4);
        account5 = accountRepository.save(account5);
        account6 = accountRepository.save(account6);
        account7 = accountRepository.save(account7);
        account8 = accountRepository.save(account8);
        account9 = accountRepository.save(account9);
        account10 = accountRepository.save(account10);
        account11 = accountRepository.save(account11);
        account12 = accountRepository.save(account12);
        account13 = accountRepository.save(account13);
        account14 = accountRepository.save(account14);
        account15 = accountRepository.save(account15);
        account16 = accountRepository.save(account16);
        account17 = accountRepository.save(account17);
        account18 = accountRepository.save(account18);
        account19 = accountRepository.save(account19);
        account20 = accountRepository.save(account20);
        account21 = accountRepository.save(account21);
        account22 = accountRepository.save(account22);
        account23 = accountRepository.save(account23);
        account24 = accountRepository.save(account24);
        account25 = accountRepository.save(account25);
        account26 = accountRepository.save(account26);
        account27 = accountRepository.save(account27);
        account28 = accountRepository.save(account28);
        account29 = accountRepository.save(account29);
        account30 = accountRepository.save(account30);
        account31 = accountRepository.save(account31);
        account32 = accountRepository.save(account32);
        account33 = accountRepository.save(account33);
        account34 = accountRepository.save(account34);
        account35 = accountRepository.save(account35);
        account36 = accountRepository.save(account36);
        account37 = accountRepository.save(account37);
        account38 = accountRepository.save(account38);
        account39 = accountRepository.save(account39);
        account40 = accountRepository.save(account40);
        account41 = accountRepository.save(account41);
        account42 = accountRepository.save(account42);
        account43 = accountRepository.save(account43);
        account44 = accountRepository.save(account44);
        account45 = accountRepository.save(account45);
        account46 = accountRepository.save(account46);
        account47 = accountRepository.save(account47);
        account48 = accountRepository.save(account48);
        account49 = accountRepository.save(account49);
        account50 = accountRepository.save(account50);
        account51 = accountRepository.save(account51);
        account52 = accountRepository.save(account52);
        account53 = accountRepository.save(account53);
        account54 = accountRepository.save(account54);
        account55 = accountRepository.save(account55);
        account56 = accountRepository.save(account56);
        account57 = accountRepository.save(account57);
        account58 = accountRepository.save(account58);
        account59 = accountRepository.save(account59);
        account60 = accountRepository.save(account60);
        account61 = accountRepository.save(account61);
        account62 = accountRepository.save(account62);
        account63 = accountRepository.save(account63);
        account64 = accountRepository.save(account64);
        account65 = accountRepository.save(account65);
        account66 = accountRepository.save(account66);
        account67 = accountRepository.save(account67);
        account68 = accountRepository.save(account68);
        account69 = accountRepository.save(account69);
        account70 = accountRepository.save(account70);
        account71 = accountRepository.save(account71);
        account72 = accountRepository.save(account72);
        account73 = accountRepository.save(account73);
        account74 = accountRepository.save(account74);
        account75 = accountRepository.save(account75);
        account76 = accountRepository.save(account76);
        account77 = accountRepository.save(account77);
        account78 = accountRepository.save(account78);
        account79 = accountRepository.save(account79);
        account80 = accountRepository.save(account80);
        account81 = accountRepository.save(account81);
        account82 = accountRepository.save(account82);
        account83 = accountRepository.save(account83);
        account84 = accountRepository.save(account84);
        account85 = accountRepository.save(account85);
        account86 = accountRepository.save(account86);
        account87 = accountRepository.save(account87);
        account88 = accountRepository.save(account88);
        account89 = accountRepository.save(account89);
        account90 = accountRepository.save(account90);
        account91 = accountRepository.save(account91);
        account92 = accountRepository.save(account92);
        account93 = accountRepository.save(account93);
        account94 = accountRepository.save(account94);
        account95 = accountRepository.save(account95);
        account96 = accountRepository.save(account96);
        account97 = accountRepository.save(account97);
        account98 = accountRepository.save(account98);
        account99 = accountRepository.save(account99);
        account100 = accountRepository.save(account100);


        //USERS
        Admin admin1 = new Admin();

        admin1.setId(1L);
        admin1.setLastname("Andrianary");
        admin1.setFirstname("Liva");
        admin1.setRole("Admin");
        admin1.setUsername("livandr@gmail.com");
        admin1.setPassword("pass");

        admin1 = authUserRepository.save(admin1);

        //CO-OWNERSHIP

        CoOwnership coOwnership1 = new CoOwnership();
        CoOwnership coOwnership2 = new CoOwnership();
        CoOwnership coOwnership3 = new CoOwnership();

        coOwnership1.setId(1L);
        coOwnership1.setBce("0850.093.053");
        coOwnership1.setCoOwnershipName("Vincennes");
        coOwnership1.setCoOwnershipAddressName("Avenue des Nerviens");
        coOwnership1.setCoOwnershipAddressNumber("141");
        coOwnership1.setCoOwnershipAddressBoxNumber("");
        coOwnership1.setCoOwnershipPostalCode(1040);
        coOwnership1.setCoOwnershipCity("Etterbeek");
        coOwnership1.setBankDetailIBAN("");
        coOwnership1.setBankDetailBIC("");

        coOwnership2.setId(2L);
        coOwnership2.setBce("0839.318.828");
        coOwnership2.setCoOwnershipName("I Love Mons");
        coOwnership2.setCoOwnershipAddressName("Rue des Trois boudins");
        coOwnership2.setCoOwnershipAddressNumber("6-8");
        coOwnership2.setCoOwnershipAddressBoxNumber("");
        coOwnership2.setCoOwnershipPostalCode(7000);
        coOwnership2.setCoOwnershipCity("Mons");
        coOwnership2.setBankDetailIBAN("");
        coOwnership2.setBankDetailBIC("");

        coOwnership3.setId(3L);
        coOwnership3.setBce("0850.158.973");
        coOwnership3.setCoOwnershipName("Pins noirs");
        coOwnership3.setCoOwnershipAddressName("Avenue E. Van Becelaere");
        coOwnership3.setCoOwnershipAddressNumber("26-26a-26b");
        coOwnership3.setCoOwnershipAddressBoxNumber("");
        coOwnership3.setCoOwnershipPostalCode(1170);
        coOwnership3.setCoOwnershipCity("Watermael-Boisfort");
        coOwnership3.setBankDetailIBAN("");
        coOwnership3.setBankDetailBIC("");

        coOwnership1 = customerRepository.save(coOwnership1);
        coOwnership2 = customerRepository.save(coOwnership2);
        coOwnership3 = customerRepository.save(coOwnership3);

        //SUPPLIERS

        Supplier suppl1 = new Supplier();
        Supplier suppl2 = new Supplier();
        Supplier suppl3 = new Supplier();
        Supplier suppl4 = new Supplier();
        Supplier suppl5 = new Supplier();
        Supplier suppl6 = new Supplier();
        Supplier suppl7 = new Supplier();

        suppl1.setSupplierId(1L);
        suppl1.setBceNumber("BE0407234704");
        suppl1.setSupplierName("TOTAL ENERGIES");
        suppl1.setStreetName("boulevard Anspach");
        suppl1.setStreetNumber("1");
        suppl1.setPostalCode(1000);
        suppl1.setCity("Bruxelles");
        suppl1.setPhone("");
        suppl1.setEmail("info@total.be");
        suppl1.setBankDetailIBAN("BE26 2700 1830 1529");
        suppl1.setBankDetailBIC("GEBABEBB");

        suppl2.setSupplierId(2L);
        suppl2.setBceNumber("BEXXXXXXX2");
        suppl2.setSupplierName("VOO");
        suppl2.setStreetName("Avenue Ariane");
        suppl2.setStreetNumber("5");
        suppl2.setStreetBoxNumber("");
        suppl2.setPostalCode(1201);
        suppl2.setCity("Woluwe-Saint-Lambert");
        suppl2.setPhone("080043666");
        suppl2.setEmail("info@voo.be");
        suppl2.setBankDetailIBAN("BE06 0963 2264 1522");
        suppl2.setBankDetailBIC("GKCCBEBB");

        suppl3.setSupplierId(3L);
        suppl3.setBceNumber("BEXXXXXXX3");
        suppl3.setSupplierName("KONE");
        suppl3.setStreetName("Boulevard Roi Albert II");
        suppl3.setStreetNumber("4");
        suppl3.setStreetBoxNumber("9");
        suppl3.setPostalCode(1200);
        suppl3.setCity("Bruxelles");
        suppl3.setPhone("027309211");
        suppl3.setEmail("info@kone.be");
        suppl3.setBankDetailIBAN("BE64 2400 1762 0052");
        suppl3.setBankDetailBIC("GEBABEBB");

        suppl4.setSupplierId(4L);
        suppl4.setBceNumber("BEXXXXXXX4");
        suppl4.setSupplierName("PROXIMUS");
        suppl4.setStreetName("Boulevard Roi Albert II");
        suppl4.setStreetNumber("27");
        suppl4.setStreetBoxNumber("");
        suppl4.setPostalCode(1030);
        suppl4.setCity("Bruxelles");
        suppl4.setPhone("027309211");
        suppl4.setEmail("info@proximus.be");
        suppl4.setBankDetailIBAN("BE50 0001 7100 3118");
        suppl4.setBankDetailBIC("BPOTBEB1");

        suppl5.setSupplierId(5L);
        suppl5.setBceNumber("BEXXXXXXX5");
        suppl5.setSupplierName("AXA ASSURANCES");
        suppl5.setStreetName("Place du Trône 1");
        suppl5.setStreetNumber("1");
        suppl5.setStreetBoxNumber("");
        suppl5.setPostalCode(1000);
        suppl5.setCity("Bruxelles");
        suppl5.setPhone("025500555");
        suppl5.setEmail("info@axa.be");
        suppl5.setBankDetailIBAN("BE28 7877 7100 7577");
        suppl5.setBankDetailBIC("AXABBE22");

        suppl6.setSupplierId(6L);
        suppl6.setBceNumber("BE0406127815");
        suppl6.setSupplierName("STIMA BELGIUM");
        suppl6.setStreetName("Rue Dries");
        suppl6.setStreetNumber("132");
        suppl6.setStreetBoxNumber("");
        suppl6.setPostalCode(1200);
        suppl6.setCity("Bruxelles");
        suppl6.setPhone("");
        suppl6.setEmail("info@stima.be");
        suppl6.setBankDetailIBAN("BE52 1141 5722 5109");
        suppl6.setBankDetailBIC("CTBKBEBB");

        suppl7.setSupplierId(7L);
        suppl7.setBceNumber("BE0202962701");
        suppl7.setSupplierName("VIVAQUA");
        suppl7.setStreetName("Boulevard de l'Impératrice");
        suppl7.setStreetNumber("17-19");
        suppl7.setStreetBoxNumber("");
        suppl7.setPostalCode(1000);
        suppl7.setCity("Bruxelles");
        suppl7.setPhone("");
        suppl7.setEmail("info@vivaqua.be");
        suppl7.setBankDetailIBAN("BE52 0960 1178 4309");
        suppl7.setBankDetailBIC("GKCCBEBB");

        suppl1 = supplierRepository.save(suppl1);
        suppl2 = supplierRepository.save(suppl2);
        suppl3 = supplierRepository.save(suppl3);
        suppl4 = supplierRepository.save(suppl4);
        suppl5 = supplierRepository.save(suppl5);
        suppl6 = supplierRepository.save(suppl6);
        suppl7 = supplierRepository.save(suppl7);

        log.info("-- DATA INIT FINISHED --");
    }
}
