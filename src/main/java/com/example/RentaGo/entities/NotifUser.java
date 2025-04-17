package com.example.RentaGo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotifUser implements Serializable {
    @EmbeddedId
    NotifUserId id;

    @ManyToOne
    @MapsId("idUtilisateur")  // maps to NotifUserId.userId
    @JoinColumn(name = "idUtilisateur")
    Utilisateur user;

    @ManyToOne
    @MapsId("idNotification")  // maps to NotifUserId.notifId
    @JoinColumn(name = "idNotification")
    Notification notif;




}
