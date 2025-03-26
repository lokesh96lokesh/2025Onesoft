package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.employee.CRUD.Controller.EmployeeController;
import com.employee.CRUD.Entity.Employee;
import com.employee.CRUD.Service.EmployeeService;

public class AssertClass {
	@InjectMocks 
	EmployeeController ec;
	
	@Mock
	EmployeeService es;
	
	@BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }
	
	@Test
	public void testgetbyId() {
		Employee emp=new Employee(5,"Michael",29,"Male",65000,"Team Lead");
		when(es.getId(5)).thenReturn(emp);
		assertEquals(ec.getMethodName(5), emp);
	}
	
	
}
