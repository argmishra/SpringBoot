package com.demo.springboot.service;

import com.demo.springboot.model.Student;

public interface StudentService {
	public Student save(Student student);
	public Student get(int id);
	public void delete(int id);
	public Student update(int id, Student student);
}