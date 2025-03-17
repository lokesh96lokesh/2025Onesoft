package com.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.Model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository <EmployeeModel,Integer>{

}
