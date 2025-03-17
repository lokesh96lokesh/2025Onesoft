package com.Vehicle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vehicle.Model.Auto;
import com.Vehicle.Service.AutoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/Auto")
public class AutoController {

	@Autowired
	AutoService as;

	@PostMapping("/postall")
	public String postAll(@RequestBody List<Auto> A) {
		return as.postAll(A);
	}

	@GetMapping("/pathAll")
	public List<Auto> getvalue() {
		return as.getvalue();
	}

	@GetMapping("/getByPrice/{a}")
	public List<Integer> getByPrice(@PathVariable int a) {
		return as.getByPrice(a);
	}

	// distinct
	@GetMapping("/getDistinctDetails")
	public List<Auto> getDistinctDetails() {
		return as.getDistinctDetails();
	}

	// max
	@GetMapping("/getMaxPrice")
	public Integer getMaxPrice() {
		return as.getMaxPrice();
	}

	// min object
	@GetMapping("/getMinObject")
	public Auto getMinObject() {
		return as.getMinObject();
	}

}
