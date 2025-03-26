package com.Customer.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Customer.Entity.Customer;
import com.Customer.Repository.CustomerRepository;

@Repository
public class CustomerDao {
	
	@Autowired
	CustomerRepository cr;
	public String postAll(List<Customer> a) {
		cr.saveAll(a);
		return "saved all Successfully";
	}
	public List<Customer> getAll() {
		return cr.findAll();
	}
	public String PostBranch(List<Customer> a) {
		cr.saveAll(a);
		return "posted Successfully";
	}

}
