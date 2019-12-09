package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.model.Employee;

@Repository
public interface EmploeeRepository extends JpaRepository<Employee, Long> {

}
