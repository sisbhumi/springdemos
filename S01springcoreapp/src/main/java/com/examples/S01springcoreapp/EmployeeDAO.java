package com.examples.S01springcoreapp;

public class EmployeeDAO {
	private String dbserver;
	private String dbport;	
	private String dbuser;
	private String password;
	public EmployeeDAO(String dbserver, String dbport, String dbuser, String dbpassword) {
		super();
		this.dbserver = dbserver;
		this.dbport = dbport;
		this.dbuser = dbuser;
		this.password = dbpassword;
	}
	
	public Employee getEmployee(int id) {
		//get db connection
		return null;
	}
	
	@Override
	public String toString() {
		return "EmployeeDAO [dbserver=" + dbserver + ", dbport=" + dbport + ", dbuser=" + dbuser + ", dbpass=" + password
				+ "]";
	}
	
	
}
