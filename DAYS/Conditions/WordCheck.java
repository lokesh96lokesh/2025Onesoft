package Conditions;

public class WordCheck {
public static void main (String[]args) {
	String a = "plague";
	String b = "gap";
	String[] c = b.split("");
	
	if(a.contains(c[0]) && a.contains(c[1]) && a.contains(c[2])) {
		System.out.println("Ok");
	}
}
}
