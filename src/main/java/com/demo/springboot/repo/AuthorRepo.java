package com.demo.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springboot.model.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer> {

}
