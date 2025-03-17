package com.Product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Product.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
