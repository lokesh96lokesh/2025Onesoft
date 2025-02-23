package Day2;

public class Test {
	public static void main(String[]args) {
		String a = "Java,Phython,CH+";
		String[] name = a.split(",");
		System.out.println(name[0]);
		String b = a.substring(0,4);
		System.out.println(b);
		int length = b.length();
		System.out.println(length);		
	}

}
