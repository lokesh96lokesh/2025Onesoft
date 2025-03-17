package com.Employee.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.Employee.Model.EmployeeModel;
import com.Employee.dao.EmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	//Add a new Employee
    public String addEmployee( EmployeeModel e) {
    	
    	return ed.addEmployee(e);
    }
    
  //Add a list new Employee
    
    public String addmoreEmployee( List<EmployeeModel> e) {
    	
    	return ed.addmoreEmployee(e);
    }
    
  //get a list new Employee
    
    public List<EmployeeModel> GetEmployee() {
    	
    	return ed.GetEmployee();
    }
    
  //get by id Employee
   
    public EmployeeModel GetEmployeebyid(@PathVariable int id) {
    	
    	return ed.GetEmployeebyid(id);
    }
    
  //get by id Employee
   
    public String dltEmployeebyid(@PathVariable int id) {
    	
    	return ed.dltEmployeebyid(id);
    }
    
  //update by id Employee
    
    public String updatebyid(int id, EmployeeModel e ) {
    	
    	return ed.updatebyid(id,e);
    }
    
  //update by id Employee
    
    public String updatebyid1( int id, EmployeeModel e ) {
    	
    	return ed.updatebyid1(id,e);
    }

}
