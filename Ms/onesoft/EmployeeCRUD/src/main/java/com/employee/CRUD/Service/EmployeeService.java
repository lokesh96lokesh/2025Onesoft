package com.employee.CRUD.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.CRUD.Dao.EmployeeDao;
import com.employee.CRUD.Entity.Employee;

@Service
public class EmployeeService {
	@Autowired 
	EmployeeDao ed;
	public Employee postEmp(Employee e) {
		return ed.postEmp(e);
	}
//	public List<Employee> postEmpAll(Employee e) {
//		return ed.postEmpAll(e);
//	}
	public List<Employee> postEmpAll(List<Employee> e) {
		return ed.postEmpAll(e);
	}
	//hello jeevanandham your are a developer now so dont waste the time learn and grow high
	public List<Employee> getAll() {
		return ed.getAll();
	}
	public  Employee getId(int a) {
		return ed.getId(a);
	}
	public String deleteId(int b) {
		return ed.deleteId(b);
	}
	public String Updatethis(int a, Employee e) {
		return ed.updatethis(a,e);
	}	
	public List<Employee> putall(List<Employee> e) {
		return ed.putall(e);
	}
	public String pathThis(int a, Employee e) {
		return ed.pathThis(a,e);
	}
	
	
}
