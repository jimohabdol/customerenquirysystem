package com.mycompany.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

}
