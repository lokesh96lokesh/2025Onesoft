package com.Employee.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


import com.Employee.Model.EmployeeModel;
import com.Employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	//Add a new Employee
    public String addEmployee( EmployeeModel e) {
    	
    	 er.save(e);
    	 return "saved successfully";
    }
    
//Add a list new Employee
    
    public String addmoreEmployee( List<EmployeeModel> e) {
    	
    	 er.saveAll(e);
    	 return "saved all";
    }
//get a list new Employee
    
    public List<EmployeeModel> GetEmployee() {
    	
    	return er.findAll();
    }
    
  //get by id Employee
    
    public EmployeeModel GetEmployeebyid(@PathVariable int id) {
    	
    	return er.findById(id).get();
    }
    
  //get by id Employee
    
    public String dltEmployeebyid(@PathVariable int id) {
    	
    	 er.deleteById(id);
    	 return "deleted";
    }
    
//update by id Employee
    
    public String updatebyid(int id, EmployeeModel e) {
    	EmployeeModel x=er.findById(id).get();
    	x.setName(e.getName());
    	x.setAge(e.getAge());
    	x.setGender(e.getGender());
    	x.setSalary(e.getSalary());
    	x.setRole(e.getRole());
    	 er.save(x);
    	 return "Updated successfully";
    }
//update by id Employee
    
    public String updatebyid1(int id, EmployeeModel e ) {
    	EmployeeModel x=er.findById(id).get();
    	//x.setName(e.getName());
    	x.setAge(e.getAge());
    	x.setGender(e.getGender());
    	x.setSalary(e.getSalary());
    	x.setRole(e.getRole());
    	 er.save(x);
    	 return "Updated successfully";
    }


}
