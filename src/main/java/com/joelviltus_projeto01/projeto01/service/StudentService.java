package com.joelviltus_projeto01.projeto01.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joelviltus_projeto01.projeto01.model.Student;
import com.joelviltus_projeto01.projeto01.repository.StudentRepository;

@Service
public class StudentService {
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student createStudent(Student student) {
		Student estudante = studentRepository.save(student);
		return estudante;
	}
	
	public Student getStudentById(int id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	public Student updateStudent(Student student) {
		Optional<Student> studentFound = studentRepository.findById(student.getIdStudent());
		
		if (studentFound.isPresent()) {
			Student studentToUpdate = studentFound.get();
			studentToUpdate.setAge(student.getAge());
			studentToUpdate.setEmail(student.getEmail());
			studentToUpdate.setName(student.getName());
			
			return studentRepository.save(studentToUpdate);
		}else {
			return null;
		}
	}
	
	public String deleteStudentById(int id) {
		studentRepository.deleteById(id);
		return "Student [" + id + "] deleted";
	}

}
