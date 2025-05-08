package com.e_Book;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	private final OrderRepository repo;

    public List<Order> getAllOrders() {
        return repo.findAll();
    }

    public Order createOrder(Order order) {
        return repo.save(order);
    }

}
