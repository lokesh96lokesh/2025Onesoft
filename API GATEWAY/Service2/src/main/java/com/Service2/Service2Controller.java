package com.Service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
	
	@Autowired
	service1Fegin sf;
	
	@GetMapping(value = "/get")
	public String getWord() {
		return "HelloWorld \t python........";
	}
	
	@GetMapping(value = "/getnamefromservice1")
	public String getName() {
		return sf.getmessage();
	}

}
