package OOPS2_Polymorphism;

public class Bank {
	public String loanAmount() {
		return "Loan Amount is:300000 ";
	}
	public String loanAmount(int salary) {
		return "Loan Amount is:"+((salary*10)+300000);
	}
	public String loanAmount(int salary,int property) {
		return "Loan Amount is:"+((salary*10)+(property/2)+300000);
	}

}
