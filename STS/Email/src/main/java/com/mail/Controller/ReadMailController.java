package com.mail.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.Service.ReadMailService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/mailRead")
public class ReadMailController {
	@Autowired
	ReadMailService rm;
	
	@GetMapping("/read")
	public String readmail() {
		return rm.readmail();
	}
	
}
