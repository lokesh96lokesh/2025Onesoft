package TestForLoop;

public class Positive {
public static void main (String[]args) {
	int a = 10;
	int b = -15;
	int c = 20;
	int d = -25;
	int total = 0;
	int[] e = {a,b,c,d};
	for(int i = 0; i<e.length; i++) {
		if(e[i]>0) {
			total=total+e[i];}}
		System.out.println(total);
	}
}

