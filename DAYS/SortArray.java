package onesoftday1;

public class SortArray {
	public static void main(String[] args) {
        // Convert input arguments to an integer array
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);  // Convert String to int
        }

        // Sorting using a simple Bubble Sort (for loop)
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
