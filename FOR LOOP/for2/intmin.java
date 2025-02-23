package for2;

public class intmin {
public static void main(String[]args) {
	int[] nums = {10,29,387,46,48,78};
	int min = nums[0];
	for(int i=0; i<nums.length; i++) {
		if(nums[i]<min){
		min = nums[i];
	}
}
	System.out.println(min);
}}

