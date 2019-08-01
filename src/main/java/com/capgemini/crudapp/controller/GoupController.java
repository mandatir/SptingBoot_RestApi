package com.capgemini.crudapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.crudapp.model.Group;
import com.capgemini.crudapp.model.User;
import com.capgemini.crudapp.service.GroupService;

@RestController
public class GoupController {

	@Autowired
	private GroupService groupService;

	@RequestMapping("groups")
	public List<Group> getAllGroups() {

		return groupService.getAllGroups();
	}
}
