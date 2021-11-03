package com.gestionetudiant.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestionetudiant.dao.GestionStudent;
import com.gestionetudiant.dao.StudentDao;
import com.gestionetudiant.entity.Student;

@RestController
public class StudentController {
	
	//@Autowired
	//private GestionStudent gestionStudent;
	
	@Autowired
	private StudentDao studentDao;
	
	
	@RequestMapping(value="/students", method=RequestMethod.GET)
    public List<Student> listeStudents() {
        return studentDao.findAll();
		//return gestionStudent.listStudent();
    }
	
	@PostMapping(value = "/students")
	public void ajouterStudent(@RequestBody Student std) {
		studentDao.save(std);
		//gestionStudent.addStudent(std);
	}
	
	@RequestMapping(value="/students/{numStudent}")
    public Optional<Student> getStudent(@PathVariable int numStudent) {
        return studentDao.findById(numStudent);
		//return gestionStudent.getStudent(numStudent);
    }
	
	@PutMapping(value = "/students/{numStudent}")
	public void modifierStudent(@RequestBody Student std, @PathVariable Integer numStudent) {
		studentDao.save(std);
		//gestionStudent.updateStudent(std.getNumeroEtudiant(), std.getNom(), std.getPrenom(), std.getAge());
	}
	
	@DeleteMapping(value = "/students/{numStudent}")
	public void deleteStudent(@PathVariable int numStudent) {
		studentDao.deleteById(numStudent);
		//gestionStudent.deleteStudent(numStudent);
	}

}
