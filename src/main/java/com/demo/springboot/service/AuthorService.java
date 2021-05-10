package com.demo.springboot.service;

import java.util.List;

import com.demo.springboot.model.Author;

public interface AuthorService {
	
	public List<Author> findAll();
}
