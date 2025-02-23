package OOPS2_Polymorphism;

public class AxisBank extends RBI {            //Child class
	public String interest(int amount) {
		return "Interest is "+((amount*12)/100);
	}

}
