package exception;

public class UseVote1 {
	public static void main(String[] args) throws AgeException {
		System.out.println("Initialized");
	int age = 17;
		try {
		if(age >= 18) {
			System.out.println("Eligible for Vote");
		}
		else{
			throw new AgeException("below 18");
			
		}
		}
		catch(AgeException b) {
			//System.out.println(b.getMessage());
			//b.printStackTrace();
			System.out.println(b);
	}
		finally {
			System.out.println("Final");
		}
		System.out.println("Finalized");

}
}
class AgeException extends Exception {
	public AgeException(String a) {
		super(a);
	}
}
