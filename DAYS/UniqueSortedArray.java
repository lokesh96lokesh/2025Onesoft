package onesoftday1;

public class UniqueSortedArray {
	public static void main(String[] args) {
        // Read input from args[0] and args[1]
        String[] arr1 = args[0].split(",");
        String[] arr2 = args[1].split(",");

        // Convert to integer arrays
        int[] nums1 = new int[arr1.length];
        int[] nums2 = new int[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            nums1[i] = Integer.parseInt(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            nums2[i] = Integer.parseInt(arr2[i]);
        }

        // Store unique elements
        int[] result = new int[nums1.length + nums2.length];
        int index = 0;

        // Add elements from nums1 that are not in nums2
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = nums1[i];
            }
        }

        // Add elements from nums2 that are not in nums1
        for (int i = 0; i < nums2.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = nums2[i];
            }
        }

        // Sort the result using Bubble Sort
        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        // Print the unique sorted values
        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
