package For;

public class sum {
public static void main(String[]args) {
	int total = 0;
	int count = 0;
	for (int i = 1; i<=10; i++) {
		if (i%2 == 0) {
			total = total +i;
			count = count + 1;}}
	System.out.println(total/count);
}
}
