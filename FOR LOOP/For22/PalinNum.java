package For22;

public class PalinNum {
	public static void main (String[]args) {
int num = 151;
int org = num;
int temp = 0;
while(org>0) {
	int a = org%10;
	temp=(temp*10)+a;
	org=org/10;
}
if(num == temp) {
	System.out.println(num+" is a palindrome");
}
else {
	System.out.println(num+" is not palindrome");
}
}}
