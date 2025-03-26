package com.Feign.Controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "mail",url="http://localhost:8080/emp")
public interface FeignEmployee {
	@GetMapping("/getAll")
	public List<Employeepojo> getall();
	
	@GetMapping("/getById/{a}")
	public Employeepojo getvalue(@PathVariable int a);
	
	@GetMapping("/deleteById/{b}")
	public String deletebyid(@PathVariable int b);
	
	@PutMapping("/UpdateEmp/{a}")
	public String putsingle(@PathVariable int a, @RequestBody Employeepojo ep);
	
	@PatchMapping("/PatchEmp/{a}")
	public String patch(@PathVariable int a,@RequestBody Employeepojo e);
}
