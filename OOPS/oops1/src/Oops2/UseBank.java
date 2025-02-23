package Oops2;

public class UseBank {
	public static void main (String[] args) {
		AxisBank a = new AxisBank();
		System.out.println(a.getIntrest(50000));
	}

}

class AxisBank extends Bank {
	public int getIntrest(int amount) {
		return amount * 10/100;
	}
}

class Bank {
	public int getIntrest(int amount) {
		return amount * 5/100;
	}
}