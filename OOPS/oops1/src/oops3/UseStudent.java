package oops3;

public class UseStudent {
	public static void main(String[] args) {
		Student1 s = new Student1();
		System.out.println(s.getName("Saravanan"));
		System.out.println(s.getTotal(10,20));
	}

}
abstract class students {
	public String getName(String name) {
		return name; 
	}
	public abstract int getTotal(int total,int total1);
}

class Student1 extends students { 
	public int getTotal(int a,int b) {
		return a+b;
	}
}
