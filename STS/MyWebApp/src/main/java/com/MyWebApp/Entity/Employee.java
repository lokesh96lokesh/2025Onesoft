package com.MyWebApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private String name;
    private int age;
    private int salary;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
//	}
//	public Employee() {
//		
//	}
//	public Employee(String name, int age, int salary) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
}
