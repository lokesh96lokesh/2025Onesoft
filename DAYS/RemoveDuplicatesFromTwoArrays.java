package onesoftday1;

public class RemoveDuplicatesFromTwoArrays {
	public static void main(String[] args) {
        // Read input strings from args[0] and args[1]
        String[] strArr1 = args[0].split(",");
        String[] strArr2 = args[1].split(",");

        // Convert to integer arrays
        int[] arr = new int[strArr1.length];
        int[] arr1 = new int[strArr2.length];

        for (int i = 0; i < strArr1.length; i++) {
            arr[i] = Integer.parseInt(strArr1[i]);
        }

        for (int i = 0; i < strArr2.length; i++) {
            arr1[i] = Integer.parseInt(strArr2[i]);
        }

        // Find unique elements (not in both arrays)
        int[] result = new int[arr.length + arr1.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = arr[i];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr1[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = arr1[i];
            }
        }

        // Sort the resulting array using a basic for-loop bubble sort
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
