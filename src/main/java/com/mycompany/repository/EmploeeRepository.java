package com.mycompany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.model.Employee;

@Repository
public interface EmploeeRepository extends CrudRepository<Employee, Long> {

}
