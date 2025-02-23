package OOPS2_Inheritance;

public class UseSoftwareEngineer {
	public static void main(String[] args) {
		SoftwareEngineer s=new SoftwareEngineer();
		s.age=25;
		s.name="raja";
		s.eatingHours=3;
		s.sleepingHours=9;
		s.workingHour=12;
		s.salaryPerHour=800;
		System.out.println("Name: "+s.name);
		System.out.println("Age: "+s.age);
		System.out.println(s.eatingHours(s.eatingHours));
		System.out.println(s.sleepingHours(s.sleepingHours));
		System.out.println("Working Hour: "+s.workingHour);
		System.out.println("Salary per Hour: "+s.salaryPerHour);
	    System.out.println(s.showSalary(s.workingHour*s.salaryPerHour));
		
		
	}

}
