package com.capgemini.crudapp.test.util;

import com.capgemini.crudapp.model.Group;
import com.capgemini.crudapp.model.Role;
import com.capgemini.crudapp.model.User;

public class EntityUtility {
	
	private static User user;
	private static Role role;
	private static Group group;
	
	public static User getUser() {
		return new User(1, "rajesh", role, group);
	}
	
	public static Role getRole() {
		return new Role(1, "Worker");
	}
	
	public static Group getGroup() {
		return new Group(1, "IT");
	}

}
