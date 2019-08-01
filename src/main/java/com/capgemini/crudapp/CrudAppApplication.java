package com.capgemini.crudapp;

import java.util.HashSet;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.crudapp.dao.GroupRepo;
import com.capgemini.crudapp.dao.UserRepo;
import com.capgemini.crudapp.model.Group;
import com.capgemini.crudapp.model.Role;
import com.capgemini.crudapp.model.User;

@SpringBootApplication(
		scanBasePackages = {
				"com.capgemini.crudapp.controller",
				"com.capgemini.crudapp.service",
				"com.capgemini.crudapp.dao"
		})
public class CrudAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudAppApplication.class, args);

	}
}
