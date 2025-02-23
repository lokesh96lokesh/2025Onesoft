package onesoftday1;

public class FirstDuplicateCharacter {
	 public static void main(String[] args) {
	        // Read input string from args[0]
	        String input = args[0];

	        // Iterate through the string
	        for (int i = 0; i < input.length(); i++) {
	            for (int j = i + 1; j < input.length(); j++) {
	                if (input.charAt(i) == input.charAt(j)) {
	                    System.out.println(input.charAt(i)); // Print first duplicate and exit
	                    return;
	                }
	            }
	        }
	    }

}
