package exception;

public class Try3 {
	public static void main(String[] args) {
		System.out.println("Initialized");
		String a =null;
		try {
			String c = a.toUpperCase();
			System.out.println(c);
		}
		catch(NullPointerException d) {
		//System.out.println(d.getMessage());
		//d.printStackTrace();
		System.out.println(d);
}
		finally {
			System.out.println("Final block");
		}
		System.out.println("Finalized");
	}
}
