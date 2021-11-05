package com.mpaiement.beans;



public class ChambreBean {
	
	 
	    private int num;
	    
	    private String description;

	    private int surface;

	    private String categorie;

	    private Double prix;
	    
	    private String statut;


	    public ChambreBean() {
	    }

		public int getNum() {
			return num;
		}


		public void setNum(int num) {
			this.num = num;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public int getSurface() {
			return surface;
		}


		public void setSurface(int surface) {
			this.surface = surface;
		}


		public String getCategorie() {
			return categorie;
		}


		public void setCategorie(String categorie) {
			this.categorie = categorie;
		}


		public Double getPrix() {
			return prix;
		}


		public void setPrix(Double prix) {
			this.prix = prix;
		}


		public String getStatut() {
			return statut;
		}


		public void setStatut(String statut) {
			this.statut = statut;
		}

		@Override
		public String toString() {
			return "Chambre [num=" + num + ", description=" + description + ", surface=" + surface + ", categorie="
					+ categorie + ", prix=" + prix + ", statut=" + statut + "]";
		}


}
