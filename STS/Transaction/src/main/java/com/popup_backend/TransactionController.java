package com.popup_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TransactionController {
	@Autowired
	SenderRepo sr;
	@Autowired
	ReciverRepo rr;
	@Transactional
	@PostMapping("/posttransaction")
	public String post(@RequestBody Transaction t) {
		sr.save(t.getSender());
		int a=10/0;
		rr.save(t.getReciver());
		
		return "posted successfully";
	}
	

}
