package TestForLoop;

public class Fibonacci {
public static void main(String[]args) {
	int a = 5;
	int b = 0;
	int c = 1;
	int d = 0;
	for(int i = 0; i<=a; i++) {
		System.out.println(b);
		d = b+c;
		b=c;
		c=d;
	}
}
}
