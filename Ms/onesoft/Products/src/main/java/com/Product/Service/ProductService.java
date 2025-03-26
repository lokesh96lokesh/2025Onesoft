package com.Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Dao.ProductDao;
import com.Product.Entity.Product;

@Service
public class ProductService {
	 @Autowired
	 ProductDao pd;

	public String postAll(List<Product> s) {
		return pd.postAll(s);
	}

	public String deleteAll() {
		return pd.deleteAll();
	}

	public List<Product> getAll() {
		return pd.getAll();
	}
	
}
