package streams_task;
import java.util.*;
import java.util.stream.Collectors;


public class Hike_Java_Dev {
	
	    public static void main(String[] args) {
	        		Employee e1 =  new Employee("John", "Java Developer", 50000);
	        		Employee e2 = new Employee("Alice", "Python Developer", 60000);
	        		Employee e3 = new Employee("Mark", "Java Developer", 55000);
	    	    	ArrayList<Employee> employees = new ArrayList<>();
	    	    	employees.add(e1);
	    	    	employees.add(e2);
	    	    	employees.add(e3);
	     

	        List<Employee> updatedSalaries = employees.stream()
	                                                  .map(emp -> emp.role.equals("Java Developer") ? 
	                                                   new Employee(emp.name, emp.role, emp.salary * 1.5) : emp)
	                                                  .collect(Collectors.toList());

	        updatedSalaries.forEach(emp ->System.out.println(emp.name + " - " + emp.role + " - " + emp.salary));
	    }
	}

class Employee {
    String name; 
    String role;
    double salary;

    Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
}
