package TestForLoop;

public class Skipthenumber {
public static void main (String[]args) {
	int a = 100;
	for(int i = 0; i<=a; i++) {
		if(i%7 != 0) {
			System.out.println(i);
		}
	}
}
}
