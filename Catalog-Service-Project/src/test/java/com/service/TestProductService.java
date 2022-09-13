package com.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.bean.Product;
import com.persistence.ProductDao;

@ExtendWith(MockitoExtension.class)
class TestProductService {
	
	@InjectMocks
	@Autowired
	private ProductServiceImpl productService;
	
	@Mock
	private ProductDao productDao;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetAllProducts_T001() {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1L,"11##34$","Monte Carlo Hat","blue flary hat for a sunny day", 300)); 
		
		Mockito.when(productDao.findAll()).thenReturn(products);
		
		assertIterableEquals(products, productService.getAllProducts());
	}
	
	@Test
	void testGetAllProducts_T002() {
		List<Product> products = new ArrayList<>();
		
		Mockito.when(productDao.findAll()).thenReturn(products);
		
		assertIterableEquals(products, productService.getAllProducts());
	}
	
	@Test
	void testgetProductByCode_T001() {
		Product product = new Product(1L,"11##34$","Monte Carlo Hat","blue flary hat for a sunny day", 300); 
		
		Mockito.when(productDao.findProductByCode("11##34$")).thenReturn(product);
		
		assertEquals(product, productService.getProductByCode("11##34$"));
	}
	@Test
	void testgetProductByCode_T002() {
		Product product = new Product(); 
		
		Mockito.when(productDao.findProductByCode("1134")).thenReturn(new Product());
		
		assertEquals(product, productService.getProductByCode("1134"));
	}

}
