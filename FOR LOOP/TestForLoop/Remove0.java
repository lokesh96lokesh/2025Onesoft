package TestForLoop;

public class Remove0 {
public static void main (String[]args) {
	int a = 0;
	int b = 1;
	int c = 2;
	int d = 3;
	int[] e = {a,b,c,d};
	for(int i = 0; i<e.length; i++) {
		if(i != 0) {
			System.out.println(i);
		}
	}
}
}
