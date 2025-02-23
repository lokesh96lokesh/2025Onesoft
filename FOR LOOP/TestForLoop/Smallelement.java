package TestForLoop;

public class Smallelement {
public static void main (String[]args) {
	int a = 2;
	int b = 1;
	int c = 4;
	int d = 5;
	int[] e = {a,b,c,d};
	int min = e[0];
	for(int i=0; i<e.length; i++) {
		if(e[i]<min) {
			min = e[i];
		//System.out.println(min);}
			if(min % 2 != 0) {
				System.out.println("Odd");
				break;
			}
			else {
				System.out.println("Even");
				break;
			}}}}}
	
	
			

