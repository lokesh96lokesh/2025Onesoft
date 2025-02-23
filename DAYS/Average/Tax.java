package Average;

public class Tax {
	public static void main(String[]args) {
		int amount=12000;
		int tax=7;
		int taxAmount=amount*tax/100;
		int totalAmount=amount+taxAmount;
		System.out.println(totalAmount+"\n"+taxAmount);
	}

}
