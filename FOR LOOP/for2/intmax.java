package for2;

public class intmax {
public static void main (String[]args) {
	int[] nums = {24,28,74,26,46,99,256};
	int max = nums[0];
	for( int i=0; i<nums.length; i++) {
		if(nums[i]>max) {
			max=nums[i];
		}
	}
	System.out.println(max);
}
}
