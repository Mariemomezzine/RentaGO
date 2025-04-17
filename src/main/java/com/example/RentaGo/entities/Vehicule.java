package com.example.RentaGo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehicule;

    String marque;

    String modele;

    String matricule;

    double prixParJour;

    String image;

    boolean disponibilite;
    @OneToMany(mappedBy = "idVehicule", cascade = CascadeType.ALL)
    Set<Reservation> reservationSet;
}
