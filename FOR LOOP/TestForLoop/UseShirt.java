package TestForLoop;

public class UseShirt {
public static void main (String[]args) {
	Shirt s1 = new Shirt();
	s1.price = 500;
	s1.brand = "RADO";
	s1.isChecked = true;
	s1.size = 32;
	Shirt s2 = new Shirt();
	s2.price = 600;
	s2.brand = "OTTO";
	s2.isChecked = true;
	s2.size = 30;
	Shirt s3 = new Shirt();
	s3.price = 650;
	s3.brand = "AERO";
	s3.isChecked = false;
	s3.size = 34;
	Shirt s4 = new Shirt();
	s4.price = 700;
	s4.brand = "RAMRAJ";
	s4.isChecked = true;
	s4.size = 38;
	Shirt[] shirt = {s1,s2,s3,s4};
	Shirt min = shirt[0];
	Shirt max = shirt[0];
	int count = 0;
	//int discount = 10;
	for(int i = 0; i<shirt.length; i++) {
		if(shirt[i].price > max.price) {
			max = shirt[i];
		}
	}
	System.out.println(max.price);
		//System.out.println(s1.brand.charAt(0)+"\n"+s2.brand.charAt(1)+"\n"+s3.brand.charAt(2)+"\n"+s4.brand.charAt(3));
//break;	}
		//if(shirt[i].brand == "A" || shirt[i].brand == "E" || shirt[i].brand == "I" || 
			//	shirt[i].brand == "O" || shirt[i].brand == "U") {
			//count++;}}
	//System.out.println("Vowels");
		}
		//if(shirt[i].size < min.size) {
			//min = shirt[i];
		//}}
		//System.out.println(min.price+min.brand+min.isChecked+min.size);
	}
	

