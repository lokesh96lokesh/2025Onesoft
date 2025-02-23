package For22;

import java.util.Arrays;

public class Arraysort {
	public static void main(String[] args) {
		String a = "egfak";
		char[] b = a.toCharArray();
		Arrays.sort(b);
		for(int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
