package com.MyWebApp.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyWebApp.Entity.Employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping(value= "/emp")
public class UseEmployee {
	public List<Employee> employees = new ArrayList<>();
	
	//Add multiple value
    @PostMapping("/addMultiple")
    public String addMultipleEmployees(@RequestBody List<Employee> newEmployees) {
        employees.addAll(newEmployees);
        return newEmployees.size() + " Employees added successfully!";
    }
    // Get all employees
    @GetMapping(value="/getAll")
    public List<Employee> getAllEmployees() {
        return employees;
    }
    //Add a new Employee
    @PostMapping(value="/add")
    public String addEmployee(@RequestBody Employee employee) {
    	employees.add(employee);
    	return "Added SuccesFully";
    }
    
    //get only a name
    @GetMapping(value="/names")
    public List<String> getName() {
    	return employees.stream()
    			.map(Employee::getName).collect(Collectors.toList());
    }
    //get salary
    @GetMapping(value="/getsalary")
    public List<Integer> getSalary() {
    	return employees.stream()
    			.map(Employee::getSalary).collect(Collectors.toList());
    }
    //get max salary more than 250000
    @GetMapping(value="/max")
    public Employee getmaxEmployees() {
        return employees.stream()
        		 .max(Comparator.comparing(Employee::getSalary))
                 .get();
    } 
    


}
