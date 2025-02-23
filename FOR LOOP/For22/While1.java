package For22;

public class While1 {
public static void main (String[]args) {
	int num = 54321;
	int total = 0;
	for(;num>0;) {
	//while(num>0) {
		int a = num%10;
		total = total+a;
		num = num/10;
	}
	System.out.println(total);
}
}
