package com.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.model.Student;
import com.demo.springboot.service.StudentService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	private MappingJacksonValue  saveStudent(@RequestBody Student student) {
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("id", "name");  
		FilterProvider filters=new SimpleFilterProvider().addFilter("DemoFilter",filter);  
		student = studentService.save(student);
		MappingJacksonValue mapping = new MappingJacksonValue(student);  
		mapping.setFilters(filters);
		return mapping;
	}

	@GetMapping("/student/{id}")
	private MappingJacksonValue getStudent(@PathVariable("id") int id) {
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("id", "name", "age", "email");  
		FilterProvider filters=new SimpleFilterProvider().addFilter("DemoFilter",filter);  
		Student student = studentService.get(id);
		MappingJacksonValue mapping = new MappingJacksonValue(student);  
		mapping.setFilters(filters);
		return mapping;
	}

	@DeleteMapping("/student/{id}")
	private void deleteStudent(@PathVariable("id") int id) {
		studentService.delete(id);
	}

	@PutMapping("/student/{id}")
	private MappingJacksonValue updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("id", "name", "age");  
		FilterProvider filters=new SimpleFilterProvider().addFilter("DemoFilter",filter);  
		studentService.update(id, student);
		MappingJacksonValue mapping = new MappingJacksonValue(student);  
		mapping.setFilters(filters);
		return mapping;
	}
}