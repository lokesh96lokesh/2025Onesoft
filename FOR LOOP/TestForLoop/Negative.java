package TestForLoop;

public class Negative {
public static void main (String[]args) {
	int a = -3;
	int b = -2;
	int c = 2;
	int d = -4;
	int count = 0;
	int[] e = {a,b,c,d};
	for(int i = 0; i<e.length; i++) {
		if(i>0) {
			count++;
		}
	}
	System.out.println(count);
}
}
