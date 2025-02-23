package for2;

public class SecondMax {
public static void main (String[]args) {
	int[] nums = {24,28,74,26,46,99,256};
	int max = nums[0];
	int secondMax = nums[0];
	for( int i=0; i<nums.length; i++) {
		if(nums[i]>max) {
			secondMax = max;
			max=nums[i];
		}
		else if(nums[i] > secondMax && nums[i] != max) {
			secondMax = nums[i];
		}
	}
	System.out.println(max);
	System.out.println(secondMax);
}
}
