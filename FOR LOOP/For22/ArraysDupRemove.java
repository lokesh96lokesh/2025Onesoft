package For22;

import java.util.Arrays;

public class ArraysDupRemove {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] arr1 = { 6, 2, 3, 5, 9, 8 };
		int[] a = new int[arr.length + arr1.length];
		for (int i = 0; i < arr.length; i++) {
			a[i] = arr[i];

		}
		int x = 0;
		for (int i = arr.length; i < a.length; i++) {
			a[i] = arr1[x];
			x++;
		}

		Arrays.sort(a);

System.out.println(Arrays.toString(a));;
		
		int[] b = new int[a.length];
		int c = 0;
		for (int k = 0; k < a.length - 1; k++) {
				if (a[k] != a[k + 1]) {
					b[c++] = a[k];
				}
				}
	b[c++] = a[a.length - 1];		
		int[]  r = Arrays.copyOf(b,c);
		System.out.println(Arrays.toString(r)); 
			}
		}
