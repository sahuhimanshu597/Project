package com.app.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;


@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TestCategoryController {
	
	@Autowired
	private CategoryController categoryController;

	@Test
	void deleteCategory() {
		System.out.println("Category Controller Test 1: Delete category with id=1");
		ResponseEntity<?> categoryStatus = categoryController.deleteCategory(1);					
		assertTrue(categoryStatus.getStatusCode().is2xxSuccessful());
	}
	
	@Test
	void getAllCategories() {
		System.out.println("Category Controller Test 2: Fetch all categories");
		ResponseEntity<?> categoryList = categoryController.getAllCategories();					
		System.out.println(categoryList.getBody().toString());
		assertTrue(categoryList.hasBody());
	}
	

}
