package com.Product.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Product.Entity.Product;
import com.Product.Repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;

	public String postAll(List<Product> s) {
		 pr.saveAll(s);
		 return "Saved All the Data Successfully";
	}

	public String deleteAll() {
		 pr.deleteAll();
		 return "delete All successFully";
	}

	public List<Product> getAll() {
		return pr.findAll();
	}
	
}
