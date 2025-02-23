package Pen;

public class UsedPen {
	public static void main(String[]args) {
		Pen p1=new Pen();
		p1.brand="moto";
		p1.price=120;
		p1.colour="yellow";
		p1.discountpercentage=5;
		p1.discountamount=p1.price*p1.discountpercentage/100;
		p1.totalprice=p1.price-p1.discountamount;
		System.out.println(p1.totalprice+"\n"+p1.colour+"\n"+p1.discountamount+"\n"+p1.brand);
	}

}
