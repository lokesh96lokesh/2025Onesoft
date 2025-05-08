package com.e_Book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {
	@Autowired
	OrderService service;

    @GetMapping
    public List<Order> getOrders() {
        return service.getAllOrders();
    }

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return service.createOrder(order);
    }

}
