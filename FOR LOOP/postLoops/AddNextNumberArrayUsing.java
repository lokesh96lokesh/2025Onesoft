package postLoops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddNextNumberArrayUsing {
	public static void main(String[] args) {
		String[] a = {"4","12","5","3","7","10","2"};
		int[] b = new int[a.length];
		for(int i = 0; i<a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		for(int i = 0; i<b.length; i++) {
if(i == b.length  -1) {
			System.out.print(b[i]+b[0]);
		}
		else {
			System.out.print(b[i]+b[i + 1]);
		}
if(i != b.length-1) {
		System.out.print(",");
		
	}

}
	}
}