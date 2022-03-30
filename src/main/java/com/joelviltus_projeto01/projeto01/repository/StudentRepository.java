package com.joelviltus_projeto01.projeto01.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.joelviltus_projeto01.projeto01.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
