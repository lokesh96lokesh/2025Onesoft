package com.Devops;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class DevopsController {
	
	@GetMapping("/get")
	public String getWord(@PathVariable String a) {
		return "Hi loki ran devops automation successfully";
	}
	

}
