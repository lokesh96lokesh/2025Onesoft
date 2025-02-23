package onesoftday1;

public class MultiplyTwoNumbersWithoutUsingmAstrix {
	public static void main(String[] args) {
        // Read input values from command line arguments
        int value1 = 8; //Integer.parseInt(args[0]);
        int value2 = 5; //Integer.parseInt(args[1]);

        int result = 0;

        // Perform multiplication using repeated addition
        for (int i = 0; i < Math.abs(value2); i++) {
            result += value1;
        }

        // Handle negative values
        if (value2 < 0) {
            result = -result;
        }

        // Print the result in the required format
        System.out.println(result);
    }

}
