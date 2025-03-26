package com.employee.CRUD.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.employee.CRUD.Entity.Employee;
import com.employee.CRUD.Service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	 
	EmployeeService es;
	//post Single employee Details
	//http://localhost:8080/emp/PostSingleEmp
	@PostMapping("/PostSingleEmp")
	public String postEmp(@RequestBody Employee e) {
		return es.postEmp(e);
	}
	//post multiple Employee Details
	@PostMapping("/PostEmpAll")
	public List<Employee> postEmpAll(@RequestBody List<Employee> e) {
		return es.postEmpAll(e);
	}
	//get All the value
	@GetMapping("/getAll")
	public List<Employee> getMethodName() {
		return es.getAll();
	}
	//get by id
	@GetMapping("/getById/{a}")
	public  Employee getMethodName(@PathVariable int a) {
		return es.getId(a);
	}
	//DeleteById
	@GetMapping("/deleteById/{b}")
	public String deleteById(@PathVariable int b) {
		return es.deleteId(b);
	}
	//updateById
	@PutMapping("UpdateEmp/{a}")
	public String putMethodName(@PathVariable int a, @RequestBody Employee e) {
		return es.Updatethis(a,e);
	}
	//patch
	@PatchMapping("PatchEmp/{a}")
	public String Patchmethod(@PathVariable int a,@RequestBody Employee e) {
		return es.pathThis(a,e);
	}
	
	
	
}
