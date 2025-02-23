package Oops2;

public class UseTeache {
	public static void main (String[]args) {
		Teache t = new Teache("Saravanan",29,true,20000,4.5f);
		System.out.println(t);
}
}

class Teache extends Human1 {
	private int salary;
	private float experience;

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setEXP(float experience) {
		this.experience = experience;
	}

	public float getEXP() {
		return experience;
	}

	public Teache(String name, int age, boolean isMale, int salary, float experience) {
		super(name, age, isMale);
		this.experience = experience;
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + ", Experience-" + experience + ", Salary" + salary;
	}
}

class Human1 {
	private String name;
	private int age;
	private boolean isMale;

	public Human1(String name2, int age2, boolean isMale2) {
		this.name=name2;
		this.age=age2;
		this.isMale=isMale2;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setISMALE(boolean isMale) {
		this.isMale = isMale;
	}

	public boolean getISMALE() {
		return isMale;
	}

	public String toString() {
		return "Name-" + name + ", Age-" + age + ", IsMale-" + isMale;
	}
}