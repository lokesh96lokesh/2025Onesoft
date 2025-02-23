package tasks;

import java.util.Arrays;

public class SumEvenNum {
public static void main(String[] args) {
	int[] a = {2,4,5,2,3,6,4,7,8};
	int sum = Arrays.stream(a).filter(x-> x%2 == 0).sum();
	System.out.println(sum);
}
}
