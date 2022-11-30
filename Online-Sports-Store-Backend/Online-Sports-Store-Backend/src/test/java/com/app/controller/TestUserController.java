package com.app.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.app.pojos.Role;
import com.app.pojos.User;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TestUserController {
	
	@Autowired
	private UserController userController;

	@Test
	void registerUser() {
		System.out.println("User Controller Test 1: Register User");
		User user = new User("Tim", "Doe", "tim@gmail.com", "tim", null, Role.DELIVERY_PERSON);
		assertTrue(userController.registerUser(user).getStatusCode().is2xxSuccessful());
	}
	
	@Test
	void getAllEmployees() {
		System.out.println("User Controller Test 2: Fetch all employees");
		ResponseEntity<?> employeeList = userController.getAllEmployees();	
		assertTrue(employeeList.hasBody());
	}
	

}
