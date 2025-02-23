package oops3;

public class UseSoftwareEngineer {
	public static void main(String[] args) {
		//SoftwareEngineer s = new SoftwareEngineer();
		Soft s = new Soft();
		System.out.println(s.getName("Saravanan")+" "+s.getAge(29)+" "+s.getId("S2556")+" "+
		s.getSalary(40000)+" "+s.getExp(4.5f)+" "+s.getId1("S11921")+" "+s.getGender(true)+" "+
				s.getPo("Exe"));
	}
}

interface Employee4 {
	public String getName(String name);
	public int getAge(int age);
	public String getId(String id);
}

interface Engineer4 extends Employee4 {
	public int getSalary(int salary);
	public float getExp(float experience);
}

interface Trainee extends Employee4 {
	public String getId1(String id1);
	public boolean getGender(boolean isMale);
	
}

class SoftwareEngineer implements Engineer4,Trainee {
	public String getName(String name) {
		return name;
	}
	public int getAge(int age) {
		return age;
	}
	public String getId(String id) {
		return id;
	}
	public int getSalary(int salary) {
		return salary;
	}
	public float getExp(float experience) {
		return experience;
	}
	public String getId1(String id1) {
		return id1;
	}
	public boolean getGender(boolean isMale) {
		return isMale;
	}
}

class Soft extends SoftwareEngineer {
	public String getPo(String position) {
		return position;
	}
}