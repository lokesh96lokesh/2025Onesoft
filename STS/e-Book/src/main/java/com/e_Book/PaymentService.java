package com.e_Book;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentService {
	private final PaymentRepository repo;

    public List<Payment> getAllPayments() {
        return repo.findAll();
    }

    public Payment makePayment(Payment payment) {
        return repo.save(payment);
    }
}
