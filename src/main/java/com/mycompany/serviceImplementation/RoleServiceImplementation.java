package com.mycompany.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.model.Product;
import com.mycompany.model.Role;
import com.mycompany.repository.RoleRepository;
import com.mycompany.service.RoleService;

public class RoleServiceImplementation implements RoleService {

	@Autowired
	private RoleRepository roleRepo;
	@Override
	public Role addRole(Role role) {
		Role r = null;
		try {
			r = roleRepo.save(role);
		} catch (Exception e) {
			System.out.println("Error saving role: "+ e.getMessage());
		}
		return r;
	}

	@Override
	public Role updateRole(Role role) {
		Role r = null;
		try {
			r = roleRepo.save(role);
		} catch (Exception e) {
			System.out.println("Error updating role: "+ e.getMessage());
		}
		return r;
	}

	@Override
	public List<Role> findAll() {
		List<Role> allRoles = new ArrayList<Role>();
		try {
			allRoles = roleRepo.findAll();
		} catch (Exception e) {
			System.out.println("Error getting role list: "+ e.getMessage());
		}
		return allRoles;
	}

}
