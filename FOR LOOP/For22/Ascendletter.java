package For22;

import java.util.Arrays;

public class Ascendletter {
public static void main (String[]args) {
	char[] z = {'d','e','s','a','j','b'};
	for(int i = 0; i<z.length; i++) {
		for(int j=i+1; j<z.length; j++) {	
		if(z[i]>z[j]) {
			char temp = z[i];
			z[i] = z[j];
			z[j] = temp; }
		}
		System.out.print(z[i]); }
System.out.println(Arrays.toString(z)); 
}
}

