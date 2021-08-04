package com.emd.mcommerce.microserviceCommande.repository;

import com.emd.mcommerce.microserviceCommande.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
