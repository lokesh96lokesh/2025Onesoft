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
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")
public class PaymentController {
	@Autowired
	PaymentService service;

    @GetMapping
    public List<Payment> getPayments() {
        return service.getAllPayments();
    }

    @PostMapping
    public Payment pay(@RequestBody Payment payment) {
        return service.makePayment(payment);
    }

}
