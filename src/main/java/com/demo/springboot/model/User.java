package com.demo.springboot.model;

public class User {
	
	private int age;
	private String name;
	private String location;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int age, String name, String location) {
		super();
		this.age = age;
		this.name = name;
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
