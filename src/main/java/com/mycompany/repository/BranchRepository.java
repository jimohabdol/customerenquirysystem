package com.mycompany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.model.Branch;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Long> {

}
