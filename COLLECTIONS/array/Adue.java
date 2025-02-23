package array;

import java.util.ArrayList;

public class Adue {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer> ();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(3);
		for(int a : nums) {
		if(a%2 == 0)
	System.out.println(a);
}
	}
}

