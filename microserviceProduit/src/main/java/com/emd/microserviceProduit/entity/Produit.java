package com.emd.microserviceProduit.entity;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Entity
public class Produit {

    @Id
    @GeneratedValue
    private int id;

    private String nom;

    private int prix;

    private int prixAchat;


}
