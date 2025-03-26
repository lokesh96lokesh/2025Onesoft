package com.Junit;


import org.junit.Test;
import org.springframework.stereotype.Component;

@Component
public class Calculatore {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub() {
		return 10-5;
	}
	public void multiply(int a,int b) {
		System.out.println("Multiply: "+a*b);
	}
	//@Test(expected = ArithmeticException.class)
	@Test
	public void div() {
		System.out.println("Divided: "+10/5);
	}
	
	
}
