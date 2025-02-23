package java8;

public class Add {
	static int a = 10;
	public Add() {
		a++;
	}
}
class UseAdd {
public static void main(String[] args) {
	System.out.println(Add.a);
	Add a1 = new Add();
	Add a2 = new Add();
	Add a3 = new Add();
	System.out.println(Add.a);
}
}
