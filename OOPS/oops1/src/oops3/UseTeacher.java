package oops3;

public class UseTeacher {
public static void main (String[] args) {
	Teacher t = new Teacher();
	System.out.println(t.getName("Saravanan")+" "+t.getAge(25)+" "+t.getGender(true)+" "+t.getFather("Sami")
+" "+t.getSalary(25000));
}
}

interface Human1 {
	public String getName(String name);
	public int getAge(int age);
		public boolean getGender(boolean isMale);
	}

interface Human2{
	public abstract String getFather(String name);
}

class Human implements Human1,Human2 {
	public String getName(String name) {
		return name;
	}
	public int getAge(int age) {
		return age;
	}
	public boolean getGender(boolean isMale) {
		return isMale;
	}
	public String getFather(String name) {
		return name;
	}
}
	class Teacher extends Human {
		public int getSalary(int salary) {
			return salary;
		}
		
	}
