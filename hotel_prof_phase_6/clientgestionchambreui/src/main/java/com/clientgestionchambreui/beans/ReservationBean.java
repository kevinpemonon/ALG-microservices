package com.clientgestionchambreui.beans;

import java.util.Date;

/* TODO */


public class ReservationBean {
	

	    private int id;

	    private Integer numChambre;

	    private Date dateReservation;

	    private Integer quantite;

	    private Boolean reservationPayee;

	    public ReservationBean() {
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
