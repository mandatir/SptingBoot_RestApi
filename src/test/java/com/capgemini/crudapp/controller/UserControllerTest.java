package com.capgemini.crudapp.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.junit.Assert;

import com.capgemini.crudapp.dao.UserRepo;
import com.capgemini.crudapp.model.User;
import com.capgemini.crudapp.test.util.EntityUtility;
import com.capgemini.crudapp.test.util.TestUtility;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UserController.class, secure = false)
public class UserControllerTest {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private UserRepo userRepo;
	@Mock
	private UserRepo mockUserRepo;
	@InjectMocks
	private UserController userController;
	
	
	
	@Test
	public void testFindByUser() throws Exception {

		User user = EntityUtility.getUser();
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		Mockito.when(this.userRepo.findByGroupId(Mockito.anyInt())).thenReturn(userList);
		// URI for get request
		String URI = "/app/users/1";
		RequestBuilder RequestBuilder = MockMvcRequestBuilders.get(URI).accept(MediaType.ALL);
		MvcResult result = mockMvc.perform(RequestBuilder).andReturn();
		String expected = TestUtility.mapToJson(userList);
		System.out.println("expected User object : " + expected);
		String actual = result.getResponse().getContentAsString();
		System.out.println("actual skill object : " + actual);

		assertThat(actual).isEqualTo(expected);
	}
	@Test
	public void testSave() throws Exception {

		User user = EntityUtility.getUser();
		Mockito.when(this.userRepo.save(Mockito.any(User.class))).thenReturn(user);
		ResponseEntity<User> responseEntity = userController.save(user);
		Assert.assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());

	}
}
