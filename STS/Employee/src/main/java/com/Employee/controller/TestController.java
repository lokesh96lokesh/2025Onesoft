package com.Employee.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("test")
@RestController
public class TestController {
	
	@GetMapping("get")
	public String getName() {
	    return "this is test controller";
	}

}
