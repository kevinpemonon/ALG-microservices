package com.mgestionchambres.activemqclient.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Chambre implements Serializable  {
	
 	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private int num;
    
    private String description;

    private int surface;

    private String categorie;

    private Double prix;
    
    private String statut;


    public Chambre() {
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


	public Chambre(int num, String description, int surface, String categorie, Double prix, String statut) {
		super();
		this.num = num;
		this.description = description;
		this.surface = surface;
		this.categorie = categorie;
		this.prix = prix;
		this.statut = statut;
	}


	@Override
	public String toString() {
		return "Chambre [num=" + num + ", description=" + description + ", surface=" + surface + ", categorie="
				+ categorie + ", prix=" + prix + ", statut=" + statut + "]";
	}

    
    

    
}
