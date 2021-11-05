package com.mchambres.web.controller;

import com.mchambres.dao.ChambreDao;
import com.mchambres.model.Chambre;
import com.mchambres.web.exceptions.ChambreNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ChambreController {

    @Autowired
    ChambreDao chambreDao;

    // Affiche la liste de toutes les chambres disponibles
    @GetMapping(value = "/chambres")
    public List<Chambre> listeDesChambres(){

        List<Chambre> chambres = chambreDao.findAll();

        if(chambres.isEmpty()) throw new ChambreNotFoundException("Aucune chambre n'est disponible à la vente");

        return chambres;

    }

    //Récuperer une chambre par son numéro
    @GetMapping( value = "/chambres/{num}")
    public Optional<Chambre> recupererUneChambre(@PathVariable int num) {

        Optional<Chambre> chambre = chambreDao.findById(num);

        if(!chambre.isPresent())  throw new ChambreNotFoundException("La chambre correspondant au numéro  " + chambre + " n'existe pas");

        return chambre;
    }
    
    @PutMapping(value = "/chambres")
    public void updateCommande(@RequestBody Chambre chambre) {

    	chambreDao.save(chambre);
    }
    
}

