package com.mycompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mycompany.model.EnquireDetails;

@Repository
public interface EnquireDetailsRepository extends JpaRepository<EnquireDetails, Long> {
	@Query(value="select * from enquire_details where CustomerName = ?1", nativeQuery=true)
	public EnquireDetails findByCustomerName(String customerName);
}
