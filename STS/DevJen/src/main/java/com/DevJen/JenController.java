package com.DevJen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenController {
	@GetMapping("/get")
	public String getWord() {
		return "Hi loki welcome";
	}
}
