package com.StuDetails.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StuDetails.Entity.Student;
import com.StuDetails.Exception.LowAgeException;
import com.StuDetails.Service.StudentService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	StudentService ss;
	
	@PostMapping("/postsingle")
	public String postvalue(@RequestBody Student s) throws LowAgeException {
		return ss.postvalue(s);
	}
	
	@PostMapping("/postAll")
	public String postAll(@RequestBody List<Student> s) {
		return ss.postAll(s);
	}
	@GetMapping("/getvalue")
	public List<Student> getvalue() {
		return ss.getvalue();
	}
	
	@PutMapping("/putmap/{a}")
	public String putMethodName(@PathVariable int a, @RequestBody Student b) {
		return ss.putmethod(a,b);
	}
	
	//delete
	@GetMapping("/deleteById/{a}")
	public String deletebyId(@PathVariable int a) {
		return ss.deletebyId(a);
	}
	
}





