package com.mycompany.model;

import javax.persistence.Entity;

@Entity
public class Employee {

	private long employeeId;
	private Branch branch;
	private String firstName;
	private String surname;
	private String address;
	private String username;
	private String password;
	private Role role;
	
	
	
}
