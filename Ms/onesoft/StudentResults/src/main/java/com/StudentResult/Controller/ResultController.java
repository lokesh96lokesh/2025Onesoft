package com.StudentResult.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentResult.Entity.Results;
import com.StudentResult.Service.ResultService;


@RestController
@RequestMapping("/Result")
public class ResultController {
	@Autowired
	ResultService rs;
	
	
	@PostMapping("/postResult")
	public String postValue() {
		return rs.postValue();
	}
	
	@GetMapping("/getTopper")
	public Results getTopper() {
		return rs.getTopper();
	}
	
	@GetMapping("/getTopThree")
	public List<Results> getTopThreeRankers() {
		return rs.getTopThreeRankers();
	}
	
	@GetMapping("/getTopThreestr")
	public List<Results> getTopThreeRankers1() {
		return rs.getTopThreeRankers1();
	}
	
	@GetMapping("/getBetween/{a}/{b}")
	public List<Results> getbetween(@PathVariable int a,@PathVariable int b) {
		return rs.getbetween(a,b);
	}
	
	
	
}
