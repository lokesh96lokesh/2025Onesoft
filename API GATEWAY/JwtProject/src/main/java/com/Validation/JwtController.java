package com.Validation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JwtController {
	
	@PostMapping("/login")
	public String postMethodName(@RequestParam String name) {
		return JWTConfig.generateToken(name);
	}
	
	
	@GetMapping("/validate")
	public String getMethodName(@RequestParam String name,@RequestParam String token) {
		
		String decodedName=JWTConfig.getusername(token);
		if(name.equals(decodedName)) {
			return "Authenticated";
		}
		else {
			return "Not valid";
		}
		
	}
	
}
