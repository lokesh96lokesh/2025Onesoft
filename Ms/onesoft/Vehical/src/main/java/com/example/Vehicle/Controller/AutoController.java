package com.example.Vehicle.Controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vehicle.Entity.Auto;
import com.example.Vehicle.Service.AutoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
@RequestMapping("/Auto")
public class AutoController {
	
	@Autowired
	AutoService as;
	@PostMapping("/postall")
	public String postMethodName(@RequestBody List<Auto> A) {
		return as.postAll(A);
	}
	@GetMapping("/getAll")
	public List<Auto> getMethodName() {
		return as.getvalue();
	}
	@GetMapping("/getByColor/{c}")
	public List<Auto> getMethodName(@PathVariable String c) {
		return as.getColor(c);
	}
	@GetMapping("/getUnique")
	public List<Integer> getUnique() {
		return as.getUnique();
	}
	@GetMapping("/getmap")
	public List<Auto> getfood() {
		return as.getfood();
	}
	//Wheel Sorted
	@GetMapping("/sorted")
	public List<Auto> getSort() {
		return as.getSorting();
	}
	//maxprice
	@GetMapping("/max")
	public Integer getMaxPrice() {
		return as.getMax();
	}
	//maxpriceObject
	@GetMapping("/maxObj")
	public Auto getmaxObj() {
		return as.getmaxobj();
	}
	//2ndmax
	@GetMapping("/2max")
	public Integer secondmax() {
		return as.getsecondMax();
	}
	//2ndminObj
	@GetMapping("/path")
	public Auto getmin() {
		return as.getmin();
	}
	//2ndmaxobj
	@GetMapping("/2maxobj")
	public Auto getsecondmaxobj() {
		return as.getsecondMaxobj();
	}
	//grouping
	@GetMapping("/group")
	public Map<String, Long> getGroup() {
		return as.getgroup();
	}
	
	
	
	
	
	
	
	
	
	
}
