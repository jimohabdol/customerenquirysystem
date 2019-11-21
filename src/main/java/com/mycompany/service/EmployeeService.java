package com.mycompany.service;

import java.util.List;

import com.mycompany.model.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public Employee findEmployee(Employee emp);
	public Employee findEmployeeById(long empId);
	public long findEmployeeByName(String empName);
	public void deleteEmployeeById(long EmpId);
	public List<Employee> findAll();

}
