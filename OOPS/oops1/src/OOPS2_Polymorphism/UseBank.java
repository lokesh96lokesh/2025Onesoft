package OOPS2_Polymorphism;

public class UseBank {
	public static void main(String[] args) {
		Bank b=new Bank();
		//System.out.println(b.loanAmount(25000, 500000));
		//System.out.println(b.loanAmount(25000));
		System.out.println(b.loanAmount());
	}

}
