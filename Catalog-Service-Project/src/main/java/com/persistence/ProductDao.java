package com.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Product;
import com.google.common.base.Optional;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {

//	public List<Product> findAll();
	
	
	public Product findProductByCode(String Code);
	
}
