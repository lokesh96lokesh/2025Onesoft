package onesoftday1;

import java.util.Scanner;

public class PalindromeWhileloop {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        sc.close();
        
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10; 
            reversedNum = reversedNum * 10 + digit; 
            num /= 10;
           
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome number.");
        }
    }

}
