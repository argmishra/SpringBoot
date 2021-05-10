package com.demo.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.model.Author;
import com.demo.springboot.repo.AuthorRepo;
import com.demo.springboot.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	public AuthorRepo authorRepo;
	
	@Override
	public List<Author> findAll() {
		return authorRepo.findAll();
	}

}
