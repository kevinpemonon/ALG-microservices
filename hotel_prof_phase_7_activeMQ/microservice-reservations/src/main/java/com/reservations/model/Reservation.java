package com.reservations.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Reservation {

    @Id
    @GeneratedValue
    private int id;

    private Integer numChambre;

    private Date dateReservation;

    private Integer quantite;

    private Boolean reservationPayee;

    public Reservation() {
    }

    public Reservation(int id, Integer productId, Date dateReservation, Integer quantite, Boolean reservationPayee) {
        this.id = id;
        this.numChambre = productId;
        this.dateReservation = dateReservation;
        this.quantite = quantite;
        this.reservationPayee = reservationPayee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(Integer numChambre) {
        this.numChambre = numChambre;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Boolean getReservationPayee() {
        return reservationPayee;
    }

    public void setReservationPayee(Boolean reservationPayee) {
        this.reservationPayee = reservationPayee;
    }

    @Override
    public String toString() {
        return "commande{" +
                "id=" + id +
                ", numChambre=" + numChambre +
                ", dateReservation=" + dateReservation +
                ", quantite=" + quantite +
                ", reservationPayee=" + reservationPayee +
                '}';
    }
}
