package For;

public class addition {
public static void main (String[]args) {
	int total = 0;
	int total1 = 0;
	for (int i = 1; i<10; i++) {
		total = total+i;
		total1 = total + total1;
	}
	System.out.println(total1);
}
}
