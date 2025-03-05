package java8;

public class Inter {
	public static void main(String[] args) {
		System.out.println(Stad.getName());
		System.out.println(Stad.getAge());
		
		
	}

}

interface Stad { 
	public static String getName() {
		return "Ranga";
	}
	public static  int getAge() {
		return 25;
	}
	
	
}
class Stat1 implements Stad {
	public  int getAge() {
		return 28;
	}
//	public static String getName() {
//		return "Ranga";
//	}
	
}
class Stat2 extends Stat1 {
//	public  String getName() {
//		return "Ranga";
//	}
	
}