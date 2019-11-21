package com.mycompany.service;

import java.util.List;

import com.mycompany.model.Role;

public interface RoleService {

	public Role addRole(Role role);
	public Role updateRole(Role role);
	public List<Role> findAll();
}
