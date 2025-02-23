package TestForLoop;

public class namestarts {
public static void main (String[]args) {
	String a = "Anand";
	String b = "Agalya";
	String c = "Ranga";
	String d = "saro";
	int count = 0;
	String[] e = {a,b,c,d};
	for(int i=0; i<e.length; i++) {
		if(e[i].startsWith("A")) {
		count++; }}	
	System.out.println(count);	
}
}
