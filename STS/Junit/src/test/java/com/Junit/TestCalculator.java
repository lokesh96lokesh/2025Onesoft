package com.Junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
    Calculator c = new Calculator();
    @Before
    public void print1() {
    	System.out.println("Test Started");
    }
    @Test
    public void testAdd() {
    	System.out.println(c.add(1,2));
    }
    @Test
    public void testSub() {
        System.out.println( c.sub()); 
    }
    @Test
    public void testMulti() {
        System.out.print("Multiplication Output: ");
        c.multi(4, 5);
    }
    @Test
    public void testDiv() {
    	System.out.print("Division Output: ");
        c.div(); 
    }
    @After
    public void print2() {
    	System.out.println("Test ended");
    }

}
