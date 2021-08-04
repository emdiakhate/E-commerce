package com.emd.mcommerce.microserviceCommande.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@ToString @AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity
public class Commande {

    @Id
    @GeneratedValue
    private Long id;

    private Integer productId;

    private Date dateCommande;

    private Integer quantite;

    private Boolean commandePayee;


}
