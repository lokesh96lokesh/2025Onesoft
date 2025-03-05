package java8;

public class UseFinal1 {
public static void main(String[] args) {
	
	final int a = 10 ;
	System.out.println(a);
	
	Final1 f1 = new Final1();	
	System.out.println(f1.getValue()+"\n"+f1.getValue(23)+"\n"+f1.getValue(23,4000));
//	Final2 f2 = new Final2();	
//	System.out.println(f2.getValue());
}
}
 final class Final1 {
	public final  int getValue() {
		return 45;
	}
	public  int getValue(int age) {
		return age;
	}
	public final String getValue(int age,int price) {
		return age+" "+price;
	}
}
//class Final2 extends Final1 {
//	public int getValue() {
//		return 15;
//	}
//}

