package com.mycompany.service;

import java.util.List;

import com.mycompany.model.EnquireDetails;

public interface EnquireDetailsService {
	
	public EnquireDetails addEnquiry(EnquireDetails enq);
	
	public EnquireDetails updateEnquiry(EnquireDetails enq);
	
	public EnquireDetails findEnquireByCustomerName(String customerName);
	
	public List<EnquireDetails> findAllEnquires();
	
	public void deleteEnquiryById(Long userId);

}
