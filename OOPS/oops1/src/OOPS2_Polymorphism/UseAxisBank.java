package OOPS2_Polymorphism;

public class UseAxisBank {
	public static void main(String[] args) {
		RBI rbi=new RBI();
		AxisBank axis=new AxisBank();
		
		System.out.println(axis.interest(100000));
		System.out.println(rbi.interest(100000));
				
	}

}
