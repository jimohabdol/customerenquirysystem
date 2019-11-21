package com.mycompany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
