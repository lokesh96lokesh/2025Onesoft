package onesoftday1;

public class NonDuplicateCharacters {
	public static void main(String[] args) {
        // Read input from command-line arguments
        String input = args[0].toUpperCase(); // Convert to uppercase for case insensitivity
        int[] frequency = new int[256]; // Array to store character frequencies

        // Count occurrences of each character using a for loop
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequency[ch]++; // Increment the count of the character
        }

        // Print non-duplicate characters (characters with count == 1)
        for (int i = 0; i < input.length(); i++) {
            if (frequency[input.charAt(i)] == 1) {
                System.out.println(input.charAt(i));
            }
        }
    }

}
