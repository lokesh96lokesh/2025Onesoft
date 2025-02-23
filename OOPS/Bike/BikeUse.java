package Bike;

public class BikeUse {
	public static void main(String[]args) {
		Bike b1=new Bike();
		b1.brand="honda";
		b1.price=5000;
		b1.ispetrol=true;
		b1.colour="green";
		b1.numberplate="tn21s4444";
		b1.discountpercentage=10;
		b1.discountamount=b1.price*b1.discountpercentage/100;
		b1.totalprice=b1.price-b1.discountamount;
		System.out.println(b1.totalprice);
		
	}

}
