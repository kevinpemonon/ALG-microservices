package com.clientgestionchambreui.controller;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clientgestionchambreui.beans.ChambreBean;
import com.clientgestionchambreui.beans.PaiementBean;
import com.clientgestionchambreui.beans.ReservationBean;
import com.clientgestionchambreui.proxies.MicroserviceChambresProxy;
import com.clientgestionchambreui.proxies.MicroservicePaiementProxy;
import com.clientgestionchambreui.proxies.MicroserviceReservationsProxy;


@Controller
public class ClientController {
	
	@Autowired
    private MicroserviceChambresProxy chambresProxy;
	
	@Autowired
    private MicroserviceReservationsProxy reservationProxy;
	
	@Autowired
    private MicroservicePaiementProxy paiementProxy;

    
    
    @RequestMapping("/")
    public String accueil(Model model){

        List<ChambreBean> chambres =  chambresProxy.listeDesChambres();

        model.addAttribute("chambres", chambres);

        return "Accueil";
    }
    
    @RequestMapping("/infos-chambre/{num}")
    public String ficheChambre(@PathVariable int num,  Model model){

        ChambreBean chambre = chambresProxy.recupererUneChambre(num);

        model.addAttribute("chambre", chambre);

        return "FicheChambre";
    }
    
    /* TODO */
    @RequestMapping(value = "/infos-chambre/reserver-chambre/{numChambre}/{montant}")
    public String reserverChambre(@PathVariable int numChambre, @PathVariable Double montant,  Model model){


        ReservationBean reservation = new ReservationBean();

        //On renseigne les propriétés de l'objet de type CommandeBean que nous avons crée
        reservation.setNumChambre(numChambre);
        reservation.setQuantite(1);
        reservation.setDateReservation(new Date());

        //appel du microservice commandes grâce à Feign et on récupère en retour les détails de la commande créée, notamment son ID (étape 4).
        ReservationBean reservationAjoutee = reservationProxy.payerUneReservation(reservation);

        //on passe à la vue l'objet commande et le montant de celle-ci afin d'avoir les informations nécessaire pour le paiement
        model.addAttribute("reservation", reservationAjoutee);
        model.addAttribute("montant", montant);

        return "Paiement";
    }
    
    /* TODO */
    @RequestMapping(value = "/payer-reservation/{numChambre}/{idReservation}/{montantReservation}")
    public String payerReservation(@PathVariable int numChambre,@PathVariable int idReservation, @PathVariable Double montantReservation, Model model){

        PaiementBean paiementAExcecuter = new PaiementBean();

        //on reseigne les détails de la reservartion
        paiementAExcecuter.setIdReservation(idReservation);
        paiementAExcecuter.setNumChambre(numChambre);
        paiementAExcecuter.setMontant(montantReservation);
        paiementAExcecuter.setNumeroCarte(numcarte()); // on génère un numéro au hasard pour simuler une CB

        
        ResponseEntity<PaiementBean> paiement = paiementProxy.payerUneReservation(paiementAExcecuter);
        
//        ChambreBean  chambreReq = chambresProxy.recupererUneChambre(numChambre);
//        
//        chambreReq.setStatut("Occupe");
//        
//        chambresProxy.updateCommande(chambreReq);

        Boolean paiementAccepte = false;
        //si le code est autre que 201 CREATED, c'est que le paiement n'a pas pu aboutir.
        if(paiement.getStatusCode() == HttpStatus.CREATED)
                paiementAccepte = true;

        model.addAttribute("paiementOk", paiementAccepte); // on envoi un Boolean paiementOk à la vue

        return "Confirmation";
    }
    
  //Génére une serie de 16 chiffres au hasard pour simuler vaguement une CB
    private Long numcarte() {
        return ThreadLocalRandom.current().nextLong(1000000000000000L,9000000000000000L );
    }

}
