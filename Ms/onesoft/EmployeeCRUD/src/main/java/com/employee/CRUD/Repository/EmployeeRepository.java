package com.employee.CRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.CRUD.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
