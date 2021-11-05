package com.reservations.web.controller;


import com.reservations.dao.ReservationsDao;
import com.reservations.model.Reservation;
import com.reservations.web.exceptions.ReservationNotFoundException;
import com.reservations.web.exceptions.ImpossibleAjouterReservationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ReservationController {

    @Autowired
    ReservationsDao reservationDao;

    @PostMapping (value = "/reservations")
    public ResponseEntity<Reservation> ajouterReservation(@RequestBody Reservation reservation){

        Reservation nouvelleReservation = reservationDao.save(reservation);

        if(nouvelleReservation == null) throw new ImpossibleAjouterReservationException("Impossible d'ajouter cette reservation");

        return new ResponseEntity<Reservation>(reservation, HttpStatus.CREATED);
    }
    
        
    @GetMapping(value = "/reservations/{id}")
    public Optional<Reservation> recupererUneReservation(@PathVariable int id){

        Optional<Reservation> reservation = reservationDao.findById(id);

        if(!reservation.isPresent()) throw new ReservationNotFoundException("Cette reservation n'existe pas");

        return reservation;
    }
}
