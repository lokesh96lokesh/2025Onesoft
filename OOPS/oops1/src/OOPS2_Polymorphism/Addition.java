package OOPS2_Polymorphism;

public class Addition {    //OverLoading method
	public String add(int num1,int num2) {
		return "Add Value :"+(num1+num2); 
	}
	public String add(int num1 ,int num2,int num3) {
		return"Add value:"+(num1+num2+num3); 
	}
	public String add(int num1,float num2) {
		return "Add value:"+(num1+num2);
	}
	public String add(float num1,float num2) {
		return "Add value:"+(num1+num2);
	}

}
