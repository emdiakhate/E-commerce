package com.emd.mcommerce.microservicePaiement.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Paiement {

    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private Integer idCommande;

    private Integer montant;

    private Long numeroCarte;
}
