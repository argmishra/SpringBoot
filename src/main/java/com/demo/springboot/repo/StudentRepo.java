package com.demo.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springboot.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
