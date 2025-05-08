package com.Service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Service1Controller {
	@Autowired
	service2Feign st;
	
	@GetMapping(value = "/get")
	public String getWord() {
		return "HelloWorld \t Java........";
	}
	@GetMapping(value = "/getnamefromservice2")
	public String getName() {
		return st.getmessage();
	}

}
