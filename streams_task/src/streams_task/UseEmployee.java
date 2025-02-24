package streams_task;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class UseEmployee {

		public static void main(String[] args) {
			Employee1 e1 =  new Employee1("John", "IT");
    		Employee1 e2 = new Employee1("Alice", "HR");
    		Employee1 e3 = new Employee1("Mark", "IT");
    		Employee1 e4 = new Employee1("Bob", "Finance");
	    	ArrayList<Employee1> employees = new ArrayList<>();
	    	employees.add(e1);
	    	employees.add(e2);
	    	employees.add(e3);
	    	employees.add(e4);
	      
	        Map<String, Long> departmentCount = employees.stream()
	            .collect(Collectors.groupingBy(emp -> emp.department, Collectors.counting()));

	        System.out.println(departmentCount);
	    }
	}

class Employee1 {
	    String name, department;
	    
	    Employee1(String name, String department) {
	        this.name = name;
	        this.department = department;
	    }
	}


