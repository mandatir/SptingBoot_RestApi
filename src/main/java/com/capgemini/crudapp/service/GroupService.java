package com.capgemini.crudapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.crudapp.dao.GroupRepo;
import com.capgemini.crudapp.model.Group;
import com.capgemini.crudapp.model.Role;
import com.capgemini.crudapp.model.User;

@Service
public class GroupService {
	@Autowired
	private GroupRepo groupRepo;

	public List<Group> getAllGroups() {

		List<Group> groups = new ArrayList<>();
		groupRepo.findAll().forEach(groups::add);
		return groups;

	}
}
