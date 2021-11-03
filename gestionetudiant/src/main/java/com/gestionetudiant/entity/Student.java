package com.gestionetudiant.entity;

public class Student {
	

	private String numeroEtudiant;

	private String nom;
	
	private String prenom;
	
	private int age;
	
	
	
	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}
	public void setNumeroEtudiant(String numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String numeroEtudiant, String nom, String prenom, int age) {
		super();
		this.numeroEtudiant = numeroEtudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
