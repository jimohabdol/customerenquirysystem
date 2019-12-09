package com.mycompany.serviceImplementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.model.Branch;
import com.mycompany.repository.BranchRepository;
import com.mycompany.service.BranchService;

public class BranchServiceImplementation implements BranchService {

	@Autowired
	BranchRepository branchRepo;
	
	@Override
	public Branch addBranch(Branch branch) {
		Branch b = null;
			try {
				if(branch!=null) {
					b = branchRepo.save(branch);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		return b;
	}

	@Override
	public Branch updateBranch(Branch branch) {
		Branch b = null;
		try {
			if(branch!=null) {
				b = branchRepo.save(branch);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	return b;
	}

	@Override
	public Branch findBranchById(Long branchId) {
		Branch findBranch = null;
		try {
			findBranch = branchRepo.getOne(branchId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return findBranch;
	}

	@Override
	public List<Branch> findAllBranchs() {
		List<Branch> findAll = null;
		try {
			findAll = branchRepo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return findAll;
	}

	@Override
	public void deleteBranchById(Long branchId) {
		try {
			branchRepo.deleteById(branchId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
