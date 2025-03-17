package com.Product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Product.Entity.Product;
import com.Product.Service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@PostMapping("/postAll")
	public String postAll(@RequestBody List<Product> s) {
		return ps.postAll(s);
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAll() {
		return ps.deleteAll();
	}
	
	@GetMapping("/getAll")
	public List<Product> getAll() {
		return ps.getAll();
	}
	
	
}
