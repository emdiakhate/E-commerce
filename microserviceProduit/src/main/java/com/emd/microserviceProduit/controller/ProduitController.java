package com.emd.microserviceProduit.controller;


import com.emd.microserviceProduit.entity.Produit;
import com.emd.microserviceProduit.exception.ProduitIntrouvableException;
import com.emd.microserviceProduit.repository.ProduitRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produits")
@Api(tags = "Microservice produit pour les opérations CRUD")
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;


    @ApiOperation("Liste des produits disponibles")
    @GetMapping("/")
    public List<Produit> listProduits(){

        return produitRepository.findAll();
    }
    @ApiOperation("Trouver un produit par son id")
    @GetMapping("/{id}")
    public Optional<Produit> chercherProduit(@PathVariable("id") Integer id) throws ProduitIntrouvableException {
        Optional<Produit> produit = produitRepository.findById(id);

        if (produit.isEmpty())
            throw new ProduitIntrouvableException("Produit introuvable");
        return produit;
    }
    @ApiOperation("Ajouter un produit dans la liste de produits disponibles")
    @PostMapping("/")
    public ResponseEntity<Void> createProduit(@RequestBody Produit produit){
        Produit produit1 = produitRepository.save(produit);
        if (produit1 == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @ApiOperation("Mettre à jour un produit")
    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") Integer id, @RequestBody Produit produit){
       Optional<Produit> produit1 = produitRepository.findById(id);

        if (produit1.isPresent())
        {

            produit1.get().setNom(produit.getNom());
            produit1.get().setPrix(produit.getPrix());
            produit1.get().setPrixAchat(produit.getPrixAchat());

            return ResponseEntity.status(HttpStatus.OK).build();
        }

        return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }


    @GetMapping("/promo/{prixLimit}")
    public List<Produit> testMethode(@PathVariable int prixLimit){

        return produitRepository.findtest(prixLimit);
    }




}
