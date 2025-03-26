package com.employee.CRUD.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.employee.CRUD.Entity.Employee;
import com.employee.CRUD.Service.EmployeeService;


import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/emp")
public class EmployeeController {
	static Logger log = Logger.getLogger(EmployeeController.class);
	@Autowired 
	EmployeeService es;
	//post Single employee Details
	//http://localhost:8080/emp/PostSingleEmp
	@PostMapping("/PostSingle")
	public Employee postEmp(@RequestBody Employee e) {
		PropertyConfigurator.configure("log4j.properties");
		log.info(es.postEmp(e));
		return es.postEmp(e);
	}
	//post multiple Employee Details
	@PostMapping("/PostAllobject")
	public List<Employee> postEmpAll(@RequestBody List<Employee> e) {
		PropertyConfigurator.configure("log4j.properties");
		log.info(es.postEmpAll(e));
		return es.postEmpAll(e);
	}
	//get All the value
	@GetMapping("/getAll")
	public List<Employee> getMethodName() {
		PropertyConfigurator.configure("log4j.properties");
		log.info(es.getAll());
		log.debug(es.getAll());
		log.fatal(es.getAll());
		return es.getAll();
	}
	//get by id
	@GetMapping("/getById/{a}")
	public  Employee getMethodName(@PathVariable int a) {
		PropertyConfigurator.configure("log4j.properties");
		log.fatal(es.getId(a));
		return es.getId(a);
	}
	//DeleteById
	@GetMapping("/deleteById/{b}")
	public String deleteById(@PathVariable int b) {
		PropertyConfigurator.configure("log4j.properties");
		log.fatal(es.deleteId(b));
		return es.deleteId(b);
	}
	//updateById
	@PutMapping("UpdateEmp/{a}")
	public String putMethodName(@PathVariable int a, @RequestBody Employee e) {
		PropertyConfigurator.configure("log4j.properties");
		log.fatal(es.Updatethis(a,e));
		return es.Updatethis(a,e);
	}
	//update all
	@PutMapping("/path")
	public List<Employee> putall(@RequestBody List<Employee> e) {
		return es.putall(e);
	}
	
	//patch
	@PatchMapping("/PatchEmp/{a}")
	public String Patchmethod(@PathVariable int a,@RequestBody Employee e) {
		PropertyConfigurator.configure("log4j.properties");
		log.fatal(es.pathThis(a,e));
		return es.pathThis(a,e);
	}
	
	
	
}
