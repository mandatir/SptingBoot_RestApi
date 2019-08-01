package com.capgemini.crudapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.crudapp.dao.UserRepo;
import com.capgemini.crudapp.model.User;

@RestController
@RequestMapping("/app")
public class UserController {

	@Autowired
	private UserRepo userRepo;

	@RequestMapping("/users")
	public List<User> getAllUsers() {

		List<User> users = new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		return users;
	}

	@PostMapping("/users")
	public ResponseEntity<User> save(@RequestBody User user) {

		User stored = this.userRepo.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(stored);
	}

	@GetMapping("/users/{groupId}")
	public ResponseEntity<List<User>> findByGroup(@PathVariable String groupId) {

		return ResponseEntity.status(HttpStatus.OK).body(this.userRepo.findByGroupId(Integer.parseInt(groupId)));
	}

}
