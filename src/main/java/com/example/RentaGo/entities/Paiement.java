package com.example.RentaGo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPaiement;

    @ManyToOne
    @JoinColumn(name = "id_reservation")
    Reservation reservation;

    LocalDate datePayement;

    double montant;

    @Enumerated(EnumType.STRING)
    Statut statut;


}
