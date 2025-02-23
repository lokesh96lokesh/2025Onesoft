package TestForLoop;

public class Uppercase {
public static void main (String[]args) {
	String a = "oNesOfT";
	String b = a.toUpperCase();
	for(int i=0;i<a.length(); i++) {
		if(a.charAt(i) == b.charAt(i)) {
			System.out.print(a.charAt(i));
		}
	}
}
}
