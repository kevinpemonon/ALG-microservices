package com.mpaiement.web.controller;

import com.mpaiement.beans.ChambreBean;
import com.mpaiement.dao.PaiementDao;
import com.mpaiement.model.Paiement;
import com.mpaiement.proxies.MicroserviceChambresProxy;
import com.mpaiement.web.exceptions.PaiementExistantException;
import com.mpaiement.web.exceptions.PaiementImpossibleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaiementController {

    @Autowired
    PaiementDao paiementDao;
    
    @Autowired
    //MicroserviceChambresProxy microserviceChambresProxy;

    @PostMapping(value = "/paiement")
    public ResponseEntity<Paiement>  payerUneReservation(@RequestBody Paiement paiement){

        //Vérifions s'il y a déjà un paiement enregistré pour cette reservation
        Paiement paiementExistant = paiementDao.findByidReservation(paiement.getIdReservation());
        if(paiementExistant != null) throw new PaiementExistantException("Cette commande est déjà payée");

        //Enregistrer le paiement
        Paiement nouveauPaiement = paiementDao.save(paiement);
        
        // A compléter


        if(nouveauPaiement == null) throw new PaiementImpossibleException("Erreur, impossible d'établir le paiement, réessayez plus tard");
        
        
        
        

        return new ResponseEntity<Paiement>(nouveauPaiement, HttpStatus.CREATED);

    }




}
