package com.demo.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springboot.model.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {

}
