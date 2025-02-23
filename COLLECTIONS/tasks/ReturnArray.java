package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnArray {
	public static void main(String[] args) {
	int[] a = {2,2,4,4,6,6,2,7,1,3,9};
	int[] r = Arrays.stream(a).distinct().toArray();
	System.out.println(Arrays.toString(r));
	}

}
