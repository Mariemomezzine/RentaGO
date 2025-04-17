package com.example.RentaGo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Facture implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long idFacture;

        @OneToOne
        @JoinColumn(name = "id_paiement")
        Paiement paiement;

        String numeroFacture;

        String pdf;

        LocalDate dateEmission;
    }


