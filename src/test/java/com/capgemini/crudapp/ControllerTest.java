package com.capgemini.crudapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.crudapp.controller.GoupController;
import com.capgemini.crudapp.controller.RolesController;
import com.capgemini.crudapp.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest {
	@Autowired
	private UserController userController;
	@Autowired
	private RolesController rolesController;
	@Autowired
	private GoupController goupController;
	@Test
    public void contexLoads() throws Exception {
        assertThat(userController).isNotNull();
        assertThat(rolesController).isNotNull();
        assertThat(goupController).isNotNull();
	}
}
