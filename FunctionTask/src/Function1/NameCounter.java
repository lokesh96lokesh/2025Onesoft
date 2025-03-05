package Function1;
import java.util.*;

public class NameCounter {

	    public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee("Loki", 28, "Male", 50000),
	            new Employee("Anu", 30, "Female", 60000),
	            new Employee("Loki", 35, "Male", 55000)
	        );

	        System.out.println("Name Counts: " + countEmployeeNames(employees));
	    }
	    public static Map<String, Integer> countEmployeeNames(List<Employee> employees) {
	        Map<String, Integer> nameCount = new HashMap<>();
	        for (Employee e : employees) {
	        	
	            nameCount.put(e.getName(), nameCount.getOrDefault(e.getName(), 0) + 1);
	        }
	        return nameCount;
	    }
	}
