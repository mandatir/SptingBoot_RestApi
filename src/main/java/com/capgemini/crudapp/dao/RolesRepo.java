package com.capgemini.crudapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.crudapp.model.Role;

public interface RolesRepo extends CrudRepository<Role, Integer>{

}
