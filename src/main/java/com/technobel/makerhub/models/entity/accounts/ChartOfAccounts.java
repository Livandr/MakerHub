package com.technobel.makerhub.models.entity.accounts;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chart_of_accounts")
@Getter @Setter
public class ChartOfAccounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
