package exception;

public class EligibleLoan {
	public static void main(String[] args) throws CibilScoreException {
		int cscore = 400;
		try {
			if(cscore > 400) {
				System.out.println("Eligible For Loan");
			}
			else {
				throw new CibilScoreException("Not Eligible For Loan");
			}
		}
		catch(CibilScoreException e) {
			System.out.println(e);
		}
	}

}
class CibilScoreException extends Exception {
	public CibilScoreException(String a) {
		super(a);
	}
}
