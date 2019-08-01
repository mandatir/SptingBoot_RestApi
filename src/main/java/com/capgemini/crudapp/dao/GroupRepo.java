package com.capgemini.crudapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.crudapp.model.Group;

public interface GroupRepo extends CrudRepository<Group, Integer> {

}
