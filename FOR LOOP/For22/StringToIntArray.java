package For22;

import java.util.Arrays;

public class StringToIntArray {
    public static void main(String[] args) {
        // Input String array
        String[] strArray = {"10", "20", "30", "40"};

        // Create an int array of the same length
        int[] intArray = new int[strArray.length];

        // Convert each String to int
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        // Print the result
        for (int num : intArray) {
            System.out.print(num + " "); // Output: 10 20 30 40
        }
    }
}

class StringToIntArray1 {
    public static void main(String[] args) {
        String[] strArray = {"10", "20", "30", "40"};

        // Convert using Streams
        int[] intArray = Arrays.stream(strArray)
                               .mapToInt(Integer::parseInt) // Parse each string
                               .toArray();                  // Collect into an int array

        // Print the result
        System.out.println(Arrays.toString(intArray)); // Output: [10, 20, 30, 40]
    }
}

class StringToIntArray2 {
    public static void main(String[] args) {
        String[] strArray = {"10", "20", "abc", "40"};
        int[] intArray = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            try {
                intArray[i] = Integer.parseInt(strArray[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number at index " + i + ": " + strArray[i]);
                intArray[i] = 0; // Assign default value for invalid entries
            }
        }

        System.out.println(Arrays.toString(intArray)); // Output: [10, 20, 0, 40]
    }
}
