package com.service;

import java.util.List;

import com.bean.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	
	public Product getProductByCode(String productCode);
	
}
