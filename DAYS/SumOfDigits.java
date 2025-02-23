package onesoftday1;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        sc.close();*/
		
		int num = 1234;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10; 
            sum += digit;         
            num /= 10;   
        }

        System.out.println("Sum of digits: " + sum);
        
        /*
        String number = args[0]; 
        int sum = 0;

        for (char digit : number.toCharArray()) {
            sum += Character.getNumericValue(digit);  
        }
        System.out.println(sum);*/
    }

}
