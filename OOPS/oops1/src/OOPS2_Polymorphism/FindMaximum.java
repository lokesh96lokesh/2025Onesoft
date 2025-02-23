package OOPS2_Polymorphism;

public class FindMaximum {                          //OverLoading
	public String findMax(int num1,int num2) {
		
		if(num1>num2) {
		return "Max number:"+num1;
		}
		else {
			return "Max number: "+num2;
		}
	}
	public String findMax(int num1,int num2,int num3) {
		if(num1<num2) {
			return "Max Number: "+num2;
		}
		else if(num2<num3) {
			return "Max Number: "+num3;
		}
		else {
			return "Max Number: "+num1;
		}
		
	}
	public String findMax(String a,String b,String c) {
		if(a.length()>b.length()) {
			return "Max length: "+a;
		}
		else if(b.length()>c.length()) {
			return "Max length: "+b;
		}
		else {
			return "Max length: "+c;
		}
	}

}
