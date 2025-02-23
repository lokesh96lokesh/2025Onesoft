package TestForLoop;

public class FirstHalfRe {
public static void main (String[]args) {
	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	int[] e = {a,b,c,d};
	for(int i=e.length/2-1; i>=0; i--) {
		System.out.println(e[i]);
	}
}
}
