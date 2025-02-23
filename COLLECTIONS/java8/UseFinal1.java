package java8;

public class UseFinal1 {
public static void main(String[] args) {
	
	final int a = 10 ;

	System.out.println(a);
//	Final1 f1 = new Final1();
//	
//	System.out.println(f1.getValue());
}
}
final class Final1 {
	public final  int getValue() {
		return 45;
	}
}
//class Final2 extends Final1 {
//	public int getValue() {
//		return 15;
//	}
//}

