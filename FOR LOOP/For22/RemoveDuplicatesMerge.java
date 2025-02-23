package For22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicatesMerge {
    public static void main(String[] args) {
        // Read input as comma-separated strings
        String[] input1 = args[0].split(",");
        String[] input2 = args[1].split(",");

        // Convert String arrays to int arrays
        int[] arr = new int[input1.length];
        int[] arr1 = new int[input2.length];

        // Fill arr from input1
        for (int i = 0; i < input1.length; i++) {
            arr[i] = Integer.parseInt(input1[i]);
        }

        // Fill arr1 from input2
        for (int i = 0; i < input2.length; i++) {
            arr1[i] = Integer.parseInt(input2[i]);
        }

        // Combine both arrays into a single list
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (!list.contains(num)) { // Avoid duplicates
                list.add(num);
            }
        }

        for (int num : arr1) {
            if (!list.contains(num)) { // Avoid duplicates
                list.add(num);
            }
        }

        // Sort the final list
        Collections.sort(list);

        // Print the result
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}