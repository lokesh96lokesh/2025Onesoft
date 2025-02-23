package onesoftday1;

public class SecondLargest {
	public static void main(String[] args) {
        // Read input values from args[0] and split by comma
        String[] inputStrings = args[0].split(",");
        int[] nums = new int[inputStrings.length];

        // Convert String array to int array
        for (int i = 0; i < inputStrings.length; i++) {
            nums[i] = Integer.parseInt(inputStrings[i]);  
        }

        // Find the largest and second largest using a normal for loop
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;  // Update second largest
                largest = nums[i];        // Update largest
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];  // Update second largest if it's smaller than largest
            }
        }

        // Print the second largest element
        System.out.println("Second largest element is " + secondLargest);
    }

}
