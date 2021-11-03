package com.gestionetudiant.dao;

import java.util.List;

import com.gestionetudiant.entity.Student;

public interface GestionStudent {
	
	public Student addStudent(Student std);
	public List<Student> listStudent(); 
	public void updateStudent(String numeroEtudiant, String nom, String prenomEtudiant, int age);
	public void deleteStudent(String numeroEtudiant);
	public Student getStudent(String numeroEtudiant);

}
