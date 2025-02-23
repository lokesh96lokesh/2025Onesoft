package onesoftday1;

public class RemoveFirstIntegerAndReverse {
	public static void main(String[] args) {
        // Read input string from args[0]
        String input = "bcd234abc"; //args[0];

        // Find the first occurrence of a digit
        int index = -1;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                index = i;
                break; // Stop at the first digit
            }
        }

        // If a digit is found, remove it from the string
        if (index != -1) {
            input = input.substring(0, index) + input.substring(index + 1);
        }

        // Reverse the modified string using a normal for loop
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Print the result
        System.out.println(reversed);
    }
}
