package com.capgemini.crudapp.test.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestUtility {
	public static String mapToJson(Object object) throws JsonProcessingException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
		}
}
