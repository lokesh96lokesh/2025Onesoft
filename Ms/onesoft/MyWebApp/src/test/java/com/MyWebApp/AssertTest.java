	package com.MyWebApp;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class AssertTest {
	MyController mycontroll= new MyController();
	
	@Before
	public void before() {
		System.out.println("Start the test:  ");
	}
	
	@Test
	public void testgetword() {
		assertEquals("HelloWorld", mycontroll.getWord());
	}
	@Test
	public void testgetword1() {
		assertEquals("Bye World.......", mycontroll.getWord1());
	}
	@Test
	public void testgetMethodName() {
		assertEquals("My Name is jeeva", mycontroll.getMethodName("jeeva"));
	}
	@Test
	public void testgetjoin() {
		assertEquals("My Full name is jeevam",mycontroll.getjoin("jeeva","m"));
	}
	@Test
	public void testgetPrime() {
		List<Integer>except=Arrays.asList(1,2,3,5,7);
		assertEquals(except,mycontroll.getPrime(1, 10));
	}
	@Test
	public void testgetEvenOdd() {
		 assertEquals("Even Number 10",mycontroll.getEvenOdd(10) );
		 //assertEquals("Odd Number 5", mycontroll.getEvenOdd(5));
	}
	@Test
    public void testGetAccess() {
        assertEquals("Access Allowed", mycontroll.getThis("Jeeva", "Jeeva123"));
        assertEquals("Access Denied", mycontroll.getThis("test", "wrong"));
    }
	@Test
	public void testAscii() {
		String input="jeeva";
		String excepted="Ascii value[106, 101, 101, 118, 97]";
		String result = mycontroll.Ascii(input);
		assertEquals(excepted,result);
	}
	@Test
	public void testgetAnagram() {
		assertEquals("Anagram", mycontroll.getAnagram("dog", "god"));
	}
	@Test
	public void testgetShirt() {
		Shirt shirt = new Shirt();
        shirt.setBrand("Nike");
        String result = mycontroll.getShirt(shirt);
        assertEquals("Nike", result);
	}
	@Test
	public void testgetminprice() {
		Shirt shirt1 = new Shirt("Nike", "Red", 1500, true, "L");
        Shirt shirt2 = new Shirt("Adidas", "Blue", 1200, false, "M");
        Shirt shirt3 = new Shirt("Puma", "Black", 1300, true, "S");
        List<Shirt> shirts = Arrays.asList(shirt1, shirt2, shirt3);
        Shirt result = mycontroll.getminprice(shirts);
        assertEquals("Adidas", result.getBrand());
        assertEquals(1200, result.getPrice());
        assertEquals("Blue", result.getColor());
	}
	@After
	public void after() {
		System.out.println("End....");
	}
}
