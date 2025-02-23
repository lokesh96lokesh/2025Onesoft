package OOPS2_Inheritance;

public class UseDoctor {
	public static void main(String[] args) {          //Useclass for Child class
		Doctor d=new Doctor();
		d.name="Pallavi";
		d.age=25;
		d.isMale=false;
		System.out.println("Name :"+d.name);
		System.out.println("Age :"+d.age);
		System.out.println("Is Male :"+d.isMale);
		System.out.println(d.meditate());
		System.out.println(d.sleep());
		System.out.println(d.showWork("Operation"));
		System.out.println(d.showIncome(89000));
	}

}
