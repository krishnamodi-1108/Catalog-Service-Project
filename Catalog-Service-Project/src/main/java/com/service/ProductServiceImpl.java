package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.persistence.ProductDao;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = productDao.findAll();
		
		if(products != null)
			return products;
		return new ArrayList<Product>();
	}

	@Override
	public Product getProductByCode(String productCode) {
		
		Product product = productDao.findProductByCode(productCode);
		if(product != null)
			return product;
		return new Product();
	}

}
