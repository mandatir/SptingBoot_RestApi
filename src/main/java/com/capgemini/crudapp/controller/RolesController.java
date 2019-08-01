package com.capgemini.crudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.crudapp.model.Role;
import com.capgemini.crudapp.service.RolesService;
@RestController
public class RolesController {
	
	@Autowired
	private RolesService rolesService;
	
	@RequestMapping("/roles")
	public List<Role> getAllUsers()
	{
		return rolesService.getAllRoles();
	}	
}
