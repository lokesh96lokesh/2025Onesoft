package onesoftday1;

public class RepeatedInteger {
	public static void main(String[] args) {
		int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);  
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) { 
                    System.out.println(nums[i]);
                    break; 
                }
            }
        }
	}

}
