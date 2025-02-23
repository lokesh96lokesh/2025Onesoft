package onesoftday1;

public class RepeatedCharacterCount {
	public static void main(String[] args) {
        // Read input string from args[0]
        String input = "aabbcc"; //args[0];

        // Convert to upperCase for case-insensitive comparison
        input = input.toUpperCase();

        // Array to store character counts (assuming ASCII letters)
        int[] charCount = new int[256];

        // Count occurrences of each character
        for (int i = 0; i < input.length(); i++) {
            charCount[input.charAt(i)]++;
        }

        // Print repeated characters and their counts
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {  // Only repeated characters
                System.out.print((char) i + " count is " + charCount[i] + " ");
            }
        }
    }

}
