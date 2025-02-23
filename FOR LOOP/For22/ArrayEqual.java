package For22;

import java.util.Arrays;

public class ArrayEqual {
	public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	int[] arr1 = {1,2,3,4,5};
	boolean result = Arrays.equals(arr, arr1);
		if(result == true) {
		System.out.println("Equal");
	}
		else {
			System.out.println("Not Equal");
		}
	}
}
