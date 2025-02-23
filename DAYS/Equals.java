package onesoftday1;

public class Equals {
	public static void main(String[] args) {

		        String[] a = args[0].split(",");
		        String[] b = args[1].split(",");
		        
		        int[] arr1 = new int[a.length];
		        int[] arr2 = new int[b.length];

		        for (int i = 0; i < a.length; i++) {
		            arr1[i] = Integer.parseInt(a[i]);
		            arr2[i] = Integer.parseInt(b[i]);
		        }

		        boolean isEqual = true;
		        for (int i = 0; i < arr1.length; i++) {
		            if (arr1[i] != arr2[i]) {
		                isEqual = false;
		                break;
		            }
		        }
		        System.out.println(isEqual ? "Equal" : "Not Equal");
		    }
		}

