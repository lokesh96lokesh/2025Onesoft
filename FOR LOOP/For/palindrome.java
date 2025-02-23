package For;

public class palindrome {
public static void main (String[]args) {
	String a = "Madam";
	String temp = " ";
//	for (int i = a.length()-1; i>=0; i--) {
//		temp = temp + a.charAt(i);
//			}
	for(int i = 0; i< a.length(); i++) {
		temp = a.charAt(i)+temp;
	}
	System.out.println(temp);
	if (a.equals(temp)) {
		System.out.println(a+" is a palindrom");
	}
}
}
