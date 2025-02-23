package Interface;

public class UseIciciBank {
	public static void main(String[] args) {        //input
		IciciBank i=new IciciBank();
		System.out.println(i.creditCardAmount(20000));
		i.amountGst(500,10000);
	}

}
