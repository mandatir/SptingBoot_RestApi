package com.capgemini.crudapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.crudapp.dao.RolesRepo;
import com.capgemini.crudapp.model.Role;

@Service
public class RolesService {

	@Autowired
	private RolesRepo rolesRepo;

	public List<Role> getAllRoles() {
		List<Role> roles = new ArrayList<>();
		rolesRepo.findAll().forEach(roles::add);
		return roles;

	}

}
