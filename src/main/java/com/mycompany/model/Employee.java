package com.mycompany.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	private long employeeId;
	@OneToMany
	@JoinTable(name = "employee_branch", joinColumns = @JoinColumn(name = "employeeId"),inverseJoinColumns = @JoinColumn(name = "branchId"))
	private ArrayList<Branch> branch;
	private String firstName;
	private String surname;
	private String address;
	private String username;
	private String password;
	@OneToMany
	@JoinTable(name = "employee_role", joinColumns = @JoinColumn(name = "employeeId"),inverseJoinColumns = @JoinColumn(name = "roleId"))
	private ArrayList<Role> role;
	
	public ArrayList<Branch> getBranch() {
		return branch;
	}
	public void setBranch(ArrayList<Branch> branch) {
		this.branch = branch;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Role> getRole() {
		return role;
	}
	public void setRole(ArrayList<Role> role) {
		this.role = role;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
}
