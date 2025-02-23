package OOPS2_Inheritance;

public class SoftwareEngineer extends Engineer {
	int workingHour;
	int salaryPerHour;
	
	public String showSalary(int salary) {
		return "Salary per Day: "+(workingHour*salaryPerHour);
	}
	

}
