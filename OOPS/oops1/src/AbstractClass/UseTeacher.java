	package AbstractClass;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher t=new Teacher();
		System.out.println("Employee Salary: "+t.empSalary(25000));
		System.out.println("Is Degree Available: "+t.empEducation(true));
	}

}
