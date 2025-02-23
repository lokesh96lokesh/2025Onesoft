package Shirt;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1 = new Shirt();
		s1.brand="rado";
		s1.price=500;
		s1.colour="blue";
		s1.ischecked=true;
		s1.discountPercentage=10;
		s1.discountAmount=s1.price*s1.discountPercentage/100;
		s1.totalprice=s1.price-s1.discountAmount;
		System.out.println(s1.totalprice);
	}

}
