package com.Feign.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "MyWebApp",url="http://localhost:8080/webapp")
public interface Feign {
	@GetMapping("/get")
	public String getWord();
	
	@GetMapping("/getname/{j}")
	public String getName(@PathVariable String j);
	
	@GetMapping("/getShirt")
	public String getshirt(@RequestBody ShirtPojo ss);
}
