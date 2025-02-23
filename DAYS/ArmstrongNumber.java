package onesoftday1;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
       /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        sc.close();
        */
        
        int num = 153;
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        //System.out.println(digits);
        
        while (num > 0) {
            int digit = num % 10; 
            //System.out.println(digit);
            sum += Math.pow(digit, digits); 
            //System.out.println(sum);
            num /= 10;
            //System.out.println(num);
        }
        
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
    }
}
