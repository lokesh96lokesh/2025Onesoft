package exception;

public class Try1 {
	public static void main(String[] args) {
		System.out.println("Initialized");
		int a = 10;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			///ae.printStackTrace();
			//System.out.println(ae);
		}
		finally {			
			System.out.println("Final block");
		}
		System.out.println("Finished");
	}

}
