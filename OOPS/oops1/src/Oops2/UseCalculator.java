package Oops2;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.getsum(12,12,12));
	}

}

class Calculator {
	public int getsum(int a,int b) {
		return a+b; 
		}
	public int getsum(int a,int b,int c) {
		return a*b*c;
	}
}