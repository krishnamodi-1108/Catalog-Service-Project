package com.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bean.Product;
import com.persistence.ProductDao;

@SpringBootTest
class CatalogServiceProjectApplicationTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Autowired
	private ProductDao productDao;
	
	@Test
	void testFindProductByCode_T001() {
		Product product = new Product(1L,"11##34$","Monte Carlo Hat","blue flary hat for a sunny day", 300); 
		assertEquals(product, productDao.findProductByCode("11##34$") );
	}
	@Test
	void testFindProductByCode_T002() {
		
		assertEquals(null, productDao.findProductByCode("125#34$") );
	}
	
}
