package For;

public class prime1 {
public static void main (String[] args) {
	int a = 9;
	int count = 0;
	for (int i = 1; i<a; i++) {
		if (a%i == 0) {
			count = count+i;		
	System.out.println(count+ " is prime");}
else {
	System.out.println(count+ " is not prime");
}}}}
