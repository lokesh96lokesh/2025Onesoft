package Conditions;

public class Elsea {
	public static void main (String[] args) {
		int a = 14;
		int b = 12;
		int c = 17;
		if ((a>b) && (a>c)) {
			System.out.println(a + " is maximum");
		}
		else if (b>c && b>a) {
			System.out.println(b + " is maximum");
		}
		else if (c>a && c>b) {
			System.out.println(c+" is maximum");
		}
	}
 
}
