package array;

import java.util.ArrayList;

public class ArrayFor {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<> ();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		for(int i=0; i<nums.size(); i++) {
			if(nums.get(i) % 2 == 0) {
			System.out.println(nums.get(i));
		}
	}

}
}
