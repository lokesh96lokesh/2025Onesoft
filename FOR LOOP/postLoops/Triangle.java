package postLoops;

public class Triangle {
	public static void main(String[] args) {
		String a = "a";
		for(int i =1; i <= 8; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(a.charAt(j % a.length()));
			}
			System.out.println();
		}
	}

}
