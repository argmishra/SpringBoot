package com.demo.springboot.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.exception.StudentNotFoundException;
import com.demo.springboot.model.Student;
import com.demo.springboot.repo.StudentRepo;
import com.demo.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student save(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student get(int id) {
		Optional<Student> student = Optional.of(studentRepo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student id " + id + " not found")));
		return student.get();
	}

	@Override
	public void delete(int id) {
		studentRepo.deleteById(id);
	}

	@Override
	public Student update(int id, Student student) {
		student.setId(id);
		studentRepo.save(student);
		Optional<Student> stu = studentRepo.findById(id);
		return stu.get();
	}

}
