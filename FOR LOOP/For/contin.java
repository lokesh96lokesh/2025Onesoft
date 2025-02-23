package For;

public class contin {
public static void main(String[]args) {
	int num = 11;
	for (int i = 1; i<num; i++) {
		if (i%2 == 0) {
		continue;	
		}
		System.out.println(i+" is odd");
	}
}
}
