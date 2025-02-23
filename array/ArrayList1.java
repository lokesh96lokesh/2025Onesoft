package array;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<> ();
		nums.add(24);
		nums.add(6);
		nums.add(98);
		nums.add(10);
		System.out.println(nums);
		nums.set(2, 10);
		System.out.println(nums);
		nums.remove(2);
		System.out.println(nums);
		System.out.println(nums.get(2));
		System.out.println(nums.size());
	}

}
