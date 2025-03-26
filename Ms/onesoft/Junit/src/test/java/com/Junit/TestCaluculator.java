package com.Junit;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCaluculator {
	Calculatore c = new Calculatore();
	
	@Before
	public void print1() {
		System.out.println("Hiiiii");
	}
	@Test
	public void testAdd() {
		System.out.println("Add: "+c.add(5, 12));
	}
	@Test
	public void testsub() {
		System.out.println("Subtraction: "+c.sub());
	}
	@Test
	public void testmultiply() {
		c.multiply(10, 5);
	}
	
//	@Test
//	public void testDiv() {
//	    try {
//	        c.div();
//	        System.out.println("Test Failed - Exception was not thrown");
//	    } catch (ArithmeticException e) {
//	        System.out.println("Test Passed - Caught ArithmeticException");
//	    }
//	}
	@Test
	public void testdiv() {
		c.div();
	}
	@After
	public void print2() {
		System.out.println("End");
	}
}
