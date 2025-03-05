package Function1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeFilter {

	    public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee("loki", 28, "Male", 50000),
	            new Employee("Anu", 40, "Female", 60000),
	            new Employee("Priya", 30, "Male", 55000)
	        );

	        List<Employee> filtered = filterEmployeesByAge(employees);
	        for (Employee e : filtered) {
	            System.out.println(e.getName() + " - " + e.getAge());
	        }
	    }
	    public static List<Employee> filterEmployeesByAge(List<Employee> employees) {
	        List<Employee> result = new ArrayList<>();
	        for (Employee e : employees) {
	            if (e.getAge() >= 25 && e.getAge() <= 35) {
	                result.add(e);
	            }
	        }
	        return result;
	    }
	}

class Employee {
    private String name;
    private int age;
    private String gender;
    private long salary;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	
    public Employee(String name, int age, String gender, long salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    
}

