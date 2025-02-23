package onesoftday1;

public class FindDuplicates {
	public static void main(String[] args) {
        // Convert input arguments to an integer array
        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);  // Convert String to int
        }

        // Find duplicate values using a normal for loop
        System.out.println("Repeated values:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) { // Check for duplicate
                    System.out.println(nums[i]);
                    break; // Avoid multiple prints for the same duplicate
                }
            }
        }
    }

}
