package onesoftday1;

public class PalindromeCheck {
	/*public static void main(String[] args) {
        // Read input number from args[0]
        int num = Integer.parseInt(args[0]);
        int original = num, reverse = 0;

        // Reverse the number using a loop
        while (num > 0) {
            int digit = num % 10; // Get last digit
            reverse = reverse * 10 + digit; // Append digit to reverse
            num /= 10; // Remove last digit
        }

        // Check if the number is a palindrome
        if (original == reverse) {
            System.out.println(original + " is palindrome");
        } else {
            System.out.println(original + " is not palindrome");
        }
        */
        
       // class Palindrome {
        	public static void main(String[] args) {
				String a= "mam";
				String t="";
				for (int i=a.length()-1;i>=0;i--) {
					t=t+a.charAt(i);
				}
				if (a.equals(t)) {
					System.out.println(t+" is a palindrome");
				}
				else {
					System.out.println(t+" is a palindrome");
				}
        	}
			} 



