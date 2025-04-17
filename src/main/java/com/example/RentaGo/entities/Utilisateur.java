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
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idUtilisateur;

    String nom;

    String prenom;

    String email;

    String motDePasse;

    String telephone;

    String adresse;

    @ManyToOne
    @JoinColumn(name = "id_role")
    Role role;
    @OneToMany(mappedBy ="idUtilisateur" )
    private Set<NotifUser>  notifUserSet;

}
