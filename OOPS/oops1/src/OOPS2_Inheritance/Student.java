package OOPS2_Inheritance;

public class Student {               //Parent class
	private String name;
	private int age;
	private boolean isMale;
	
	public void setName(String name ) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setisMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public Student(String name,int age,boolean isMale) {
		this.name=name;
		this.age=age;
		this.isMale=isMale;
	}
	public String toString() {
		return name+", "+age+", "+isMale;
	}

}
