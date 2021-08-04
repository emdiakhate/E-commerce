package com.emd.microserviceProduit.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Data @Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Entity

public class Produit {

    @Id
    @GeneratedValue
    private int id;

    private String nom;

    private int prix;

    private int prixAchat;


}
