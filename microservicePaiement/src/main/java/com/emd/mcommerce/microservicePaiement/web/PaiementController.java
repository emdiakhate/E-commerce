package com.emd.mcommerce.microservicePaiement.web;

import com.emd.mcommerce.microservicePaiement.entity.Paiement;
import com.emd.mcommerce.microservicePaiement.repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PaiementController {

    @Autowired
    private PaiementRepository paiementRepository;

    @PostMapping("/paiement")
    public ResponseEntity<Paiement> payerUneCommande(@RequestBody Paiement paiement){

        if (paiement.getIdCommande() == null )
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        paiementRepository.save(paiement);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
