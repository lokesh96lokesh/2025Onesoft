package java8;

public class Stat {
	static {
		System.out.println("Static Block");
	}
	
	static int a = 10; 
	
	public static void main(String[] args) {
		System.out.println(Stat.a);
		System.out.println("Main Method");
	}
	 }
