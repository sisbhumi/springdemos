	package com.examples.S02Autowire;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	int id;
	String 	name;
	
	
	@Autowired
	@Qualifier("address1")
	private Address homeadd;
	
	
	@Autowired
	@Qualifier("address2")
	private Address officeadd;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + " homeadd="+ homeadd + "]";
	}
	
	
}
