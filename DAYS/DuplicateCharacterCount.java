package onesoftday1;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCount {
	public static void main(String[] args) {
        // Read input from command-line arguments
        String input = args[0].toUpperCase(); // Convert to uppercase for case insensitivity
        int[] frequency = new int[256]; // Array to store character frequencies

        // Count occurrences of each character using a for loop
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequency[ch]++; // Increment the count of the character
        }

        // Print duplicate characters (characters with count > 1)
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 1) {
                System.out.println((char) i + "=" + frequency[i]);
            }
        }
    }
}
