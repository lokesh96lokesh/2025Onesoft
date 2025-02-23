package exception;

public class Fun {
	public static void main(String[] args) {
		System.out.println("Initialized");
			int[] a = {1,2,3,4};
			int b  = 0;
			try {
				int c = a[1]/b;
			System.out.println(c);			
		}
			catch(ArithmeticException e) {
				System.out.println("ArthmeticException "+e);
			}
			catch(ArrayIndexOutOfBoundsException r) {
				System.out.println("ArrayIndexOfBoundsException "+r);
			}
			catch(Exception d) {
				d.getMessage();
				}
			System.out.println("Finalized");
	}
}
