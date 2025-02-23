package onesoftday1;

import java.util.Arrays;

public class SortString {
	public static void main(String[] args) {
        // Read input from args[0]
        String input = args[0];

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Print sorted characters with space
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }

}
