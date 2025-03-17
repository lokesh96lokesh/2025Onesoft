package com.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Entity.Bank;
import com.Bank.Service.BankService;


@RestController
@RequestMapping("/Bank")
public class BankController {
	@Autowired 
	BankService bs;
	
	@PostMapping("/postAll")
	public String postAll(@RequestBody List<Bank> B) {
		return bs.postAll(B);
	}
	@GetMapping("/getbranchbyIFSC/{a}")
	public String getIFSC(@PathVariable String a) {
		return bs.getIFSC(a);
	}
	
}
