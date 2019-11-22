package com.mycompany.service;

import java.util.List;

import com.mycompany.model.Branch;

public interface BranchService {

	public Branch addBranch(Branch branch);
	
	public Branch updateBranch(Branch branch);
	
	public Branch findBranchById(Long branchId);
	
	public List<Branch> findAllBranchs();
	
	public void deleteBranchById(Long branchId);
}
