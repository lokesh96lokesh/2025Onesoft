package For;

public class fibonacci {
public static void main (String[]args) {
	int a = 0;
	int b = 1;
	int c = 0;
	int sum=0;
	for ( int i = 0; i<10; i++) {
		System.out.println(a);
		c = a+b;
		a=b;
		b=c;
		sum=sum+b;
	}
	System.out.println(sum);
}
}
