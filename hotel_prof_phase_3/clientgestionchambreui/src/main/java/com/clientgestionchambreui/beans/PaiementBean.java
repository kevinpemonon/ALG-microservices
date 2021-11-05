package com.clientgestionchambreui.beans;

public class PaiementBean {
	
	/* TODO */

	
	    private int id;

	    private Integer idReservation;
	    
	    private Integer numChambre;

		private Double montant;

	    private Long numeroCarte;

	    public PaiementBean() {
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

	    public void setIdReservation(Integer idCommande) {
	        this.idReservation = idCommande;
	    }

	    public Double getMontant() {
	        return montant;
	    }

	    public void setMontant(Double montant) {
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
	        return "PaiementBean{" +
	                "id=" + id +
	                ", idReservation=" + idReservation +
	                ", montant=" + montant +
	                ", numeroCarte=" + numeroCarte +
	                '}';
	    }


}
