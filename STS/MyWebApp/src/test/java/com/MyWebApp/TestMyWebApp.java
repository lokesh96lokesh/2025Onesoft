package com.MyWebApp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import com.MyWebApp.Controller.MyWebAppController;
import com.MyWebApp.Controller.UseShirt;
import com.MyWebApp.Entity.Shirt;

public class TestMyWebApp {
	
	
	MyWebAppController controller=new MyWebAppController();
    UseShirt controller1 = new UseShirt();

	
	@Test
    public void testGetWord() {
        assertEquals("HelloWorld \t Java........", controller.getWord());
    }

    @Test
    public void testGetWord1() {
        assertEquals("Bye World.......", controller.getWord1());
    }

    @Test
    public void testGetMethodName() {
        assertEquals("My Name is Loki", controller.getMethodName("Loki"));
    }

    @Test
    public void testGetJoin() {
        assertEquals("My name is: loki salary: 50000", controller.getjoin("loki", 50000));
    }

    @Test
    public void testGetPrimeNumbers() {
        List<Integer> expectedPrimes = Arrays.asList(3,4,5,6,7,8,9,10);
        assertEquals(expectedPrimes, controller.getPrime(1, 10));
    }

    @Test
    public void testGetEvenOdd() {
        assertEquals("Even Number 8", controller.getEvenOdd(8));
        assertEquals("Odd Numbers 9", controller.getEvenOdd(9));
    }

    @Test
    public void testGetAccess() {
        assertEquals("Access Allowed", controller.getThis("loki", "123"));
        assertEquals("Access Denied", controller.getThis("test", "wrong"));
    }

    @Test
    public void testAnagram() {
        assertEquals("Anagram", controller.getAnagram("heart", "earth"));
        assertEquals("Not a Anagram", controller.getAnagram("hello", "world"));
    }

    @Test
    public void testReversed() {
        assertEquals("DLROWolleh", controller.reversed("Hello", "World"));
    }
    @Test
    public void testGetShirt() {
        List<Shirt> shirts = List.of(
                new Shirt("Red Shirt", 500,"black",true,24),
                new Shirt("Blue Shirt", 800,"yellow",false,40)
        );

        List<Shirt> result = controller1.getShirt(shirts);

        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void testGetMinPrice() {
        List<Shirt> shirts = List.of(
        		new Shirt("Red Shirt", 500,"black",true,24),
                new Shirt("Blue Shirt", 800,"yellow",false,40),
                new Shirt("Green Shirt", 300,"blue",true,42)
        );

        Shirt result = controller1.getminprice(shirts); 

        assertNotNull(result);
        assertEquals(300, result.getPrice());
    }
    
    @Test
    public void testGetMaxPrice() {
        List<Shirt> shirts = List.of(
        		new Shirt("Red Shirt", 500,"black",true,24),
                new Shirt("Blue Shirt", 800,"yellow",false,40),
                new Shirt("Green Shirt", 300,"blue",true,42)
        );

        Shirt result = controller1.getminprice(shirts); 

        assertNotNull(result);
        assertEquals(800, result.getPrice());
    }

   
}