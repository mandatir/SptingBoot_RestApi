package com.capgemini.crudapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.crudapp.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {

	// getAllUsers()
	// getUser(int id)
	// updateUser(User u)
	// deleteUser(int id)
	List<User> findByGroupId(Integer groupId);

}
