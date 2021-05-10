package com.demo.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.model.Post;
import com.demo.springboot.repo.PostRepo;
import com.demo.springboot.service.PostService;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	public PostRepo postRepo;

	@Override
	public List<Post> findAll() {
		return postRepo.findAll();
	}

}
