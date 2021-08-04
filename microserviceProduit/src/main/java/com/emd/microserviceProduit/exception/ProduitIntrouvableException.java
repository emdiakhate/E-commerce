package com.emd.microserviceProduit.exception;

import com.emd.microserviceProduit.entity.Produit;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProduitIntrouvableException extends RuntimeException {

   public ProduitIntrouvableException(String message){
       super(message);

   }
}
