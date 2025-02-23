package Interface;

public class UsePersonalLoan extends PersonalLoan {
	public String cibilScore(int cibil) {
		if (cibil >= 700 && cibil <= 800) {
			return "Excellent";
		} 
		else if (cibil >= 600 && cibil <= 699) {
			return "Good";
		}
		else if (cibil >= 500 && cibil <= 599) {
			return "Average";
		}
		else if (cibil <= 499) {
			return "Poor";
		}
		else {
			return "Invalid input";
		}
	}

	public void approval(String cibilScore, int salary) {
		if (cibilScore.equals("Excellent") && salary >= 20000 || cibilScore.equals("Good") && salary >= 20000) {
			System.out.println("Loan Approved");
		} else {
			System.out.println("Loan not approved");
		}
	}

	public static void main(String[] args) {
		UsePersonalLoan loan = new UsePersonalLoan();
		String a = loan.cibilScore(770);
		int b = loan.salary(27000);
		loan.approval(a, b);

	}

}
