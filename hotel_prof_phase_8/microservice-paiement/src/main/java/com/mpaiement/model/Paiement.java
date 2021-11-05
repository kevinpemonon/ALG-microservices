package com.mpaiement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Paiement {

    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private Integer idReservation;
    
    private Integer numChambre;
  
	private Integer montant;

    private Long numeroCarte;

    public Paiement() {
    }

    public Paiement(int id, Integer idReservation, Integer montant, Long numeroCarte) {
        this.id = id;
        this.idReservation = idReservation;
        this.montant = montant;
        this.numeroCarte = numeroCarte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public Long getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(Long numeroCarte) {
        this.numeroCarte = numeroCarte;
    }
    
    public Integer getNumChambre() {
		return numChambre;
	}

	public void setNumChambre(Integer numChambre) {
		this.numChambre = numChambre;
	}

    @Override
    public String toString() {
        return "Paiement{" +
                "id=" + id +
                ", idReservation=" + idReservation +
                ", montant=" + montant +
                ", numeroCarte=" + numeroCarte +
                '}';
    }
}
