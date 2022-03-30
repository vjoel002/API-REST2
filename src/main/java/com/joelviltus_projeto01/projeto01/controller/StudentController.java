package com.joelviltus_projeto01.projeto01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joelviltus_projeto01.projeto01.model.Student;
import com.joelviltus_projeto01.projeto01.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		return ResponseEntity.ok(studentService.createStudent(student));
	}
	
	@GetMapping("/{idStudent}")
	public ResponseEntity<Student> getStudentById(@PathVariable int idStudent){
		return ResponseEntity.ok(studentService.getStudentById(idStudent));
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudentById(@RequestBody Student student){
		return ResponseEntity.ok(studentService.updateStudent(student));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudentById(@PathVariable int id){
		return ResponseEntity.ok(studentService.deleteStudentById(id));
	}


}
