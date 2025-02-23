package exception;

import java.util.ArrayList;

public class UseMixie {
	public static void main(String[] args) throws NoWarrantyException {
	System.out.println("Initialized");
	Mixie m1 = new Mixie("Preeti","High",6000,12);
	Mixie m2 = new Mixie("Butterfly","Medium",4000,6);
	Mixie m3 = new Mixie("Aporva","Low",2000,0);
	Mixie m4 = new Mixie("Celina","Low",2000,0);
	Mixie m5 = new Mixie("Nano","Medium",3000,-3);
ArrayList<Mixie> m = new ArrayList<>();
m.add(m1);
m.add(m2);
m.add(m3);
m.add(m4);
m.add(m5);
for(Mixie me : m) {
	try {
		if(me.getN() <= 0) {
			System.out.println("No Warranty: "+me);
		}
		else {
			throw new NoWarrantyException("Warranty: Brand: "+me.getB()+" NoOfMonthsWarranty: "+me.getN());
	}
}
catch(NoWarrantyException e) {
	System.out.println(e);
}
}
	System.out.println("Finalized");
}
}

class Mixie {
	String brand;
	String model;
	int price;
	int noOfMonthsWarranty;
	public Mixie(String brand,String model,int price,int noOfMonthsWarranty) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.noOfMonthsWarranty = noOfMonthsWarranty;
			}
	public void setB(String brand) {
		this.brand = brand;
	}
	public String getB() {
		return brand;
	}
	public void setM(String model) {
		this.model = model;
	}
	public String getM() {
		return model;
	}
	public void setP(int price) {
		this.price = price;
	}
	public int getP() {
		return price;
	}
	public void setN(int noOfMonthsWarranty) {
		this.noOfMonthsWarranty = noOfMonthsWarranty;
	}
	public int getN() {
		return noOfMonthsWarranty;
	}
	public String toString() {
		return brand+" "+model+" "+price+" "+noOfMonthsWarranty;
	}
}

class NoWarrantyException extends Exception {
	public NoWarrantyException(String a) {
	super(a);
}
}
