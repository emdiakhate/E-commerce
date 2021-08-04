package com.emd.mcommerce.microserviceCommande.controller;

import com.emd.mcommerce.microserviceCommande.entity.Commande;
import com.emd.mcommerce.microserviceCommande.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandeController {

    @Autowired
    private CommandeRepository commandeRepository;

    @PostMapping("/commandes")
    public ResponseEntity<Commande> ajouterCommande(@RequestBody Commande commande){

        if (commande == null )
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        commandeRepository.save(commande);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
