package com.app.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.pojos.Product;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TestProductServiceImpl {
	
	@Autowired
	private IProductService productService;

	@Test
	void getProductsByCategory() {
		System.out.println("Product Service Test 1: Fetch all products in category id=1");
		List<Product> productList = productService.getProductsByCategory(1);
		productList.forEach(p -> assertEquals(1, p.getSelectedCategory().getId()));
	}
	
	@Test
	void deleteProduct() {
		System.out.println("Product Service Test 2: Delete product with id=3");
		String deleteResult = productService.deleteProduct(3);
		System.out.println("Delete Result: "+deleteResult);
		assertNotNull(deleteResult);
	}

}
