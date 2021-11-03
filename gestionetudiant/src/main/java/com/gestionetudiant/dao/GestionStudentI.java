package com.gestionetudiant.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gestionetudiant.entity.Student;

@Repository
public class GestionStudentI implements GestionStudent  {
	
	private List<Student> students=new ArrayList<>();
	{
		students.add(new Student(001,"Paul","Henry",18));
	}

	@Override
	public Student addStudent(Student std) {
		students.add(std);
		return std;
	}

	@Override
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public void updateStudent(int numeroEtudiant, String nom, String prenom, int age) {
		for (Student std : students) {
			if (std.getNumeroEtudiant() == numeroEtudiant) {
				std.setNom(nom);
				std.setPrenom(prenom);
				std.setAge(age);
			}
		}
		
	}

	@Override
	public void deleteStudent(int numeroEtudiant) {
		Student std = getStudent(numeroEtudiant);
		students.remove(std);
		
	}

	@Override
	public Student getStudent(int numeroEtudiant) {
		for (Student std : students) {
			if (std.getNumeroEtudiant() == numeroEtudiant) {
				return std;
			}
		}
		return null;
	}

	

}
