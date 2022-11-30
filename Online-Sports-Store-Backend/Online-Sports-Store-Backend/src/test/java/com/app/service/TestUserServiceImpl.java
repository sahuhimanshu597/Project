package com.app.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.pojos.Role;
import com.app.pojos.User;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TestUserServiceImpl {
	
	@Autowired
	private IUserService userService;
	
	@Test
	void findById() {
		System.out.println("User Service Test 1: User with id=1 must be an ADMIN");
		User user1 = userService.findById(1);
		assertEquals(Role.ADMIN, user1.getRole());
		
	}
	
	@Test
	void getUsersByRole() {
		System.out.println("User Service Test 2: Fetch all users with the role of ADMIN");
		List<User> userList = userService.getUsersByRole("ADMIN");
		userList.forEach(u -> assertEquals(Role.ADMIN, u.getRole()));
	}


}
