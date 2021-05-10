package com.demo.springboot.service;

import java.util.List;

import com.demo.springboot.model.User;

public interface UserService {
	
	public List<User> findAllUsers();

}
