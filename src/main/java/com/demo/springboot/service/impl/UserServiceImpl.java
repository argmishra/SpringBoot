package com.demo.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.springboot.model.User;
import com.demo.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<User> findAllUsers() {
		List<User> usersList = new ArrayList<User>();
		usersList.add(new User(23, "Anurag", "Ireland"));
		usersList.add(new User(25, "Sonu", "India"));
		return usersList;

	}

}
