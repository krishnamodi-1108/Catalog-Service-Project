package com.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.bean.ProductList;
import com.service.ProductService;

@RestController
public class ProductResource {

	@Autowired
	private ProductService productService;
	
	@GetMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductList listAllProducts() {
		return new ProductList(productService.getAllProducts());
	}
	
	@GetMapping(path = "/products/code/{productCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getDoctorById(@PathVariable("productCode") String productCode) {
		return productService.getProductByCode(productCode);
	}
}
