package Interface;

public class IciciBank implements Bank {
	public int creditCardAmount(int amount) {
		return amount;
	}
	public void amountGst(int gst,int amount) {
		System.out.println(amount+gst);
	}

}
