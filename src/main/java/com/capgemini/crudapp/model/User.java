package com.capgemini.crudapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	private int id;
	private String name;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "group_id")
	private Group group;

	public User() {
	}

	public User(int id, String name, Role role, Group group) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.group = group;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	
}
