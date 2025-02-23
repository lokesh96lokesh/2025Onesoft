package TestForLoop;

public class Palin {
public static void main (String[]args) {
	String a = "amma";
	String b = "";
	for(int i=a.length()-1; i>=0; i--) {
		b=b+a.charAt(i); 
			//System.out.println(b);
			if(a.equals(b)) {
				System.out.println("PALINDROME");
		}
	}}}


