package Function;

import java.util.Arrays;

public class ReverseCharArray {

	public static void main(String[] args) {
		char arr[]= {'a','b','c','d'};
		System.out.println("Before Reverse: "+Arrays.toString(arr));
		reverse(arr);
	}
	public static void reverse(char arr[]) {
		String reversed = "";
		for(int i=arr.length-1;i>=0;i--) {
			reversed+=arr[i];
		}
		System.out.print("After reverse: "+reversed);
	}

}
