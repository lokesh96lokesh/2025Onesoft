package Conditions;

public class Middle {
public static void main (String[] args) {
	String a = "Apple";
	if (a.length()%2 != 0) {
		System.out.println(a.charAt(a.length()/2));}
	else {
		System.out.println(a.substring(a.length()/2-1,(a.length()/2)+1));
	}
}
}