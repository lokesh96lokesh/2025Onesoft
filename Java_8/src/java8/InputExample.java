package java8;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read string input
        System.out.print("Enter your name: ");
        String name = scanner.next();

        // Read integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Read char input
        System.out.println("Enter your initial: ");
        char initial = scanner.next().charAt(0);

        // Read boolean input
        System.out.println("Is he male:");
        boolean isMale = scanner.nextBoolean();
        // Read double input
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Display collected inputs
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("isMale "+isMale+" ");

        // Close the scanner
        scanner.close();
    }
}