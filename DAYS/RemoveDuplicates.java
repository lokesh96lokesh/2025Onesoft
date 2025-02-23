package onesoftday1;

public class RemoveDuplicates {
	  public static void main(String[] args) {
	        // Read input values from args[0] and split by comma
	        String[] inputStrings = args[0].split(",");
	        int[] nums = new int[inputStrings.length];

	        // Convert String array to int array
	        for (int i = 0; i < inputStrings.length; i++) {
	            nums[i] = Integer.parseInt(inputStrings[i]);  
	        }

	        // Remove duplicates and print unique values
	        System.out.println("Unique elements:");
	        System.out.println(nums[0]); // Print the first element

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) { // Check if current is different from previous
	                System.out.println(nums[i]);
	            }
	        }
	    }

}
