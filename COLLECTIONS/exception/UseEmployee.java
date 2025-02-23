package exception;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) throws SalaryException {
		System.out.println("Initialized");
		Employee e1 = new Employee("Saro",25000);
		Employee e2 = new Employee("Ranga",22000);
		Employee e3 = new Employee("Pradeep",23000);
		Employee e4 = new Employee("Arun",18000);
		Employee e5 = new Employee("Kamal",19000);
		ArrayList<Employee> es = new ArrayList<>();
		es.add(e1);
		es.add(e2);
		es.add(e3);
		es.add(e4);
		es.add(e5);
		for(Employee e : es) {
			try {
				if(e.getSalary() > 20000) {
				System.out.println("Above 20000: "+e);
			}
				else {		
					throw new SalaryException("below 20000: Name: "+e.getName()+" Salary: "+e.getSalary());
				}
		}
			catch (SalaryException ad) {
				System.out.println(ad);
			}
		}
		System.out.println("Finalized");
	}

}

class Employee {
	String name;
	int salary;
	public Employee(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return "Name: "+name+" Salary: "+salary;
	}
}
class SalaryException extends Exception {
	public SalaryException(String a) {
		super(a);
	}
}
