package com.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {
	@GetMapping(value = "/get")
	public String getWord() {
		return "muthae..... maniyae......";
	}
	@GetMapping(value = "/getStudent")
	public String getStudent() {
		return "this is student";
	}
	@GetMapping(value = "/getTrainer")
	public String getTrainer() {
		return "this is trainer";
	}
	@GetMapping(value = "/getManager")
	public String getManager() {
		return "this is manager";
	}
}
