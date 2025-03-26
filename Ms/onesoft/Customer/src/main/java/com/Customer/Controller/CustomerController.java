package com.Customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Customer.Entity.Customer;
import com.Customer.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService cs;
	
	
	@PostMapping("/postAll")
	public String postAll(@RequestBody List<Customer> a) {
		return cs.postAll(a);
	}
	
	@GetMapping("/getAll")
	public List<Customer> getAll() {
		return cs.getAll();
	}
	
	@PostMapping("/postbranch")
	public String postBranch(@RequestBody List<Customer> a) {
		return cs.PostBranch(a);
	}
	
	
	
}
