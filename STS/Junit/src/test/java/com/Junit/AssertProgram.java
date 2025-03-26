package com.Junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class AssertProgram {
    Calculator c = new Calculator();

	@Test
    public void testEqual() {
        assertEquals(5, 5);
    }

    @Test
    public void testNotEqual() {
        assertNotEquals(5, 6);  
    }

    @Test
    public void testNull() {
        assertNull(null);  
    }

    @Test
    public void testNotNull() {
        assertNotNull("JUnit"); 
    }

    @Test
    public void testSame() {
        String str = "loki";
        assertSame("loki", str);  
    }

    @Test
    public void testNotSame() {
        assertNotSame("loki", "anu");  
    }

    @Test
    public void testArrayEquals() {
        int[] a = {5, 10, 3};
        int[] b = {5, 10, 3};
        assertArrayEquals(a, b);  
    }

    @Test
    public void testTrueCondition() {
        assertTrue(10 > 7);
    }

    @Test
    public void testFalseCondition() {
        assertFalse(10 < 7);
    }
    @Test
    public void testAdd() {
    	assertEquals(3, c.add(1,2));
    }

}
