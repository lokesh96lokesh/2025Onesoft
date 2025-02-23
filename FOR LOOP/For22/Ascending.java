package For22;

import java.util.Arrays;

public class Ascending {
public static void main (String[]args) {
	int[] a = {10,12,14,7};
	for(int i =0; i<a.length; i++) {
		for(int j = i+1; j<a.length; j++) {
			if(a[i]>a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		System.out.println(a[i]);
	}
	System.out.println(Arrays.toString(a));
}
}
