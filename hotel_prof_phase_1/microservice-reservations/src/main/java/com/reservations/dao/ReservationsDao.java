package com.reservations.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservations.model.Reservation;

@Repository
public interface ReservationsDao extends JpaRepository<Reservation, Integer> {
}
