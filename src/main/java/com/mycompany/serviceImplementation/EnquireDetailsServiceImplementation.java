package com.mycompany.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.model.EnquireDetails;
import com.mycompany.repository.EnquireDetailsRepository;
import com.mycompany.service.EnquireDetailsService;

public class EnquireDetailsServiceImplementation implements EnquireDetailsService {

	@Autowired
	private EnquireDetailsRepository enquireRepo;
	
	@Override
	public EnquireDetails addEnquiry(EnquireDetails enq) {
		EnquireDetails enquire = null;
		try {
			if(enq != null) {
				enquire = enquireRepo.save(enq);
			}
		} catch (Exception e) {
			System.out.println("Error saving enquiry details: "+ e.getMessage());
		}
		return enquire;
	}

	@Override
	public EnquireDetails updateEnquiry(EnquireDetails enq) {
		EnquireDetails enquire = null;
		try {
			if(enq != null) {
				enquire = enquireRepo.save(enq);
			}
		} catch (Exception e) {
			System.out.println("Error updating enquiry details: "+ e.getMessage());
		}
		return enquire;
	}

	@Override
	public EnquireDetails findEnquireByCustomerName(String customerName) {
		EnquireDetails en = null;
		try {
			en = enquireRepo.findByCustomerName(customerName);
		} catch (Exception e) {
			System.out.println("Error finding enquiry details: "+ e.getMessage());
		}
		return en;
	}

	@Override
	public List<EnquireDetails> findAllEnquires() {
		List<EnquireDetails> findAll = new ArrayList<EnquireDetails>();
		try {
			findAll = enquireRepo.findAll();
		} catch (Exception e) {
			System.out.println("Error getting all enquiry details: "+ e.getMessage());
		}
		return findAll;
	}

	@Override
	public void deleteEnquiryById(Long userId) {
		try {
			enquireRepo.deleteById(userId);
		} catch (Exception e) {
			System.out.println("Error deleting enquiry details: "+ e.getMessage());
		}

	}

}
