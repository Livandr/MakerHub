package com.technobel.makerhub.models.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "accounting_exercise")
@Data
public class AccountingExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, name = "start_exercise")
    private LocalDate startExercise;
    @Column(nullable = false, name = "end_exercise")
    private LocalDate endExercise;


}
