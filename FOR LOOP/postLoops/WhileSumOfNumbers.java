package postLoops;

public class WhileSumOfNumbers {
	public static void main(String[] args) {
		int a = 5;
		int i = 1;
		int sum = 0;
		while(i <= a) {
		sum = sum + i;
		i++;
		}
		System.out.println(sum);
	}

}
