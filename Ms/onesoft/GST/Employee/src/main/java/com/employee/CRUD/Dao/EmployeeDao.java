package com.employee.CRUD.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.CRUD.Entity.Employee;
import com.employee.CRUD.Repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	 
	EmployeeRepository er;
	public String postEmp(Employee e) {
		er.save(e);
		return "Saved Succeffully";
	}
//	public List<Employee> postEmpAll(Employee e) {
//		return er.saveAll(e);
//	}
	public List<Employee> postEmpAll(List<Employee> e) {
		
		return er.saveAll(e);
	}
	public List<Employee> getAll() {
		return er.findAll();
	}
	public  Employee getId(int a) {
		return er.findById(a).get();
	}
	public String deleteId(int b) {
		er.deleteById(b);
		return "Deleted Succeffuly";
	}
	public String updatethis(int a, Employee e) {
		Employee emp=er.findById(a).get();
		emp.setName(e.getName());
		emp.setAge(e.getAge());
		emp.setGender(e.getGender());
		emp.setSalary(e.getSalary());
		emp.setRole(e.getRole());
		er.save(emp);
		return "Succefully Updated";
	}
	public String pathThis(int a, Employee e) {
		Employee emp = er.findById(a).get();
		emp.setName(e.getName());
		er.save(emp);
		return "Succefully Patched";
	}
}




