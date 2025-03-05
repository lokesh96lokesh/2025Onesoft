package Function1;
import java.util.*;

public class MaleEmployeeFilter {

	    public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee("loki", 28, "Male", 50000),
	            new Employee("Anu", 22, "Female", 60000),
	            new Employee("Shiva", 30, "Male", 55000)
	        );

	        System.out.println("Male Employees: " + getMaleEmployees(employees));
	    }
	    public static Map<String, Long> getMaleEmployees(List<Employee> employees) {
	        Map<String, Long> result = new HashMap<>();
	        for (Employee e : employees) {
	            if (e.getAge() > 20 && "Male".equalsIgnoreCase(e.getGender())) {
	                result.put(e.getName(), e.getSalary());
	            }
	        }
	        return result;
	    }
	}

