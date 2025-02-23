package exception;

public class Try2 {
	public static void main(String[] args) {
		System.out.println("Initialized");
	
		int c = 2;
		try {
			int x = Integer.parseInt("1z");
		int	a= x+c;
			System.out.println(a);
		}
		catch(NumberFormatException v) {
		//System.out.println(v.getMessage());
			//v.printStackTrace();
			System.out.println(v);
		}
		finally {
			System.out.println("Final Block");
		}
		System.out.println("Finalized");
	}

}
