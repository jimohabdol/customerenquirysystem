package com.mycompany.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.model.Employee;
import com.mycompany.repository.EmploeeRepository;
import com.mycompany.service.EmployeeService;

public class EmployeeServiceImplemation implements EmployeeService {

	@Autowired
	private EmploeeRepository empRepo;
	@Override
	public Employee addEmployee(Employee emp) {
		Employee em = null;
		try {
			if (emp!=null) {
				em = empRepo.save(emp);
			}
		} catch (Exception e) {
			System.out.println("Error saving employee: "+ e.getMessage());
		}
		return em;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		Employee em = null;
		try {
			if(emp != null) {
				em=empRepo.save(emp);
			}
		} catch (Exception e) {
			System.out.println("Error updating employee: "+ e.getMessage());
		}
		return em;
	}

	@Override
	public Employee findEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployeeById(long empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long findEmployeeByName(String empName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteEmployeeById(long EmpId) {
		empRepo.deleteById(EmpId);
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> allEmp = new ArrayList<Employee>();
		try {
			allEmp = empRepo.findAll();
		} catch (Exception e) {
			System.out.println("Error get all employees: "+ e.getMessage());
		}
		return allEmp;
	}

}
