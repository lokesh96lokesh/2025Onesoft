package com.entityProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	OrderRepository or;

	@PostMapping("placeOrder")
	public String placeOrder(@RequestBody Order order) {
		or.save(order);
		return "Order Successfully placed.";
	}

	@GetMapping("fetchOrders")
	public List<Order> fetchOrders() {
		List<Order> orders = or.findAll();

		return orders;

	}
}
