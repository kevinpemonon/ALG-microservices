package com.mchambres.web.controller;

import com.mchambres.dao.ChambreDao;
import com.mchambres.model.Chambre;
import com.mchambres.web.exceptions.ChambreNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("chambres")
public class ChambreController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ChambreDao chambreDao;

    // Affiche la liste de toutes les chambres disponibles
    @GetMapping
    public List<Chambre> listeDesChambres(){

        List<Chambre> chambres = chambreDao.findAll();

        if(chambres.isEmpty()) throw new ChambreNotFoundException("Aucune chambre n'est disponible à la vente");
        
        log.info("Récupération de la liste des chambres");

        return chambres;

    }

    //Récuperer une chambre par son numéro
    @GetMapping( value = "{num}")
    public Optional<Chambre> recupererUneChambre(@PathVariable int num) {

        Optional<Chambre> chambre = chambreDao.findById(num);

        if(!chambre.isPresent())  throw new ChambreNotFoundException("La chambre correspondant au numéro  " + chambre + " n'existe pas");

        return chambre;
    }
    
    @PutMapping(value = "{num}")
    public void updateCommande(@RequestBody Chambre chambre, @PathVariable int num) {
        	chambreDao.save(chambre);
    }
    
}

