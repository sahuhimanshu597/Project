package com.app.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TestCartServiceImpl {
	
	@Autowired
	private ICartService cartService;

	@Test
	void addItemToCart() {
		System.out.println("Cart Service Test 1: Add item to cart");
		String itemStatus = cartService.addItemToCart(3, 1, 4);
		System.out.println(itemStatus);
		assertTrue(itemStatus.endsWith(" added to cart"));
		
	}
	
	@Test
	void updateQuantity() {
		System.out.println("Cart Service Test 1: Updating quantity in cart");
		String itemStatus = cartService.updateQuantity(1, 2);
		System.out.println(itemStatus);
		assertEquals("success",itemStatus);
		
	}
	
	

}
