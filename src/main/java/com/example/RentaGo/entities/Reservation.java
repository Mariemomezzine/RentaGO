package com.example.RentaGo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idResrvation;

    @ManyToOne
    @JoinColumn(name = "id_voiture")
    Vehicule voiture;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    Utilisateur utilisateur;

    LocalDate dateDebut;

    LocalDate dateFin;
    @Enumerated(EnumType.STRING)
    Etat etat;

    double montantTotale;

    String ville;

    String numeroTel;
    @OneToMany(mappedBy = "idResrvation", cascade = CascadeType.ALL)
    Set<Paiement> paiementSet;


}
