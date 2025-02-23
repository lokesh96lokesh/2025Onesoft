package onesoftday1;

public class AVERAGE {
public static void main(String[] args) {
	//average
	int a =5;
	int count=0;
	int total=0;
	for (int i=1;i<=a;i++) {
		count++;
		total =total + i;
	}
	int avg=total/count;
	System.out.println("Total count: "+count);
	System.out.println(avg);
}
}
