package exception;

public class UseVote {
	public static void main(String[] args) throws AgeException {
		int age = 17;
		if (age >= 18) {
			System.out.println("Eligible for Vote");
		} else {
			throw new AgeException("Below 18");
		}
		System.out.println("Voted");
	}

}

class AgeException extends Exception {
	public AgeException(String a) {
		super(a);
	}
}
