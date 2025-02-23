package For22;

public class Amstrong {
public static void main (String[]args) {
	int num = 153;
	int org = num;
	int temp = 0;
	while(num>0) {
		int a = num % 10; // Reminder-Evu
		int b = a*a*a;
		temp=temp+b;
		num=num/10; // Q-Meethi
	}
	if(org == temp) {
		System.out.println(org+ " is Amstrong");}
	else {
		System.out.println(org+" is not Amstrong");
	}
}
}
