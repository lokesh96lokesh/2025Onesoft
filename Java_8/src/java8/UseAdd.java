package java8;


public class UseAdd extends Var {
public static void main(String[] args) {
	System.out.println(Add.a);
	Add a1 = new Add();
	Add a2 = new Add();
	Add a3 = new Add();
	Var c1 = new Var();
	System.out.println(Add.a); 
	System.out.println(a3.b);
	System.out.println(a2.b);
	System.out.println(Var.v(25));
	System.out.println(c1.c(25));
	System.out.println(c1.f(25));
}
}

 class Add {
	static int a = 10;
	int b=20;
	public Add() {
		a++;
		b++;
	}
}

   class Var {
	public static int v (int v) {
		return v;
	}
	public  int c (int c) {
		return c;
	}
	public  int f (int f) {
		return f;
	}
 }