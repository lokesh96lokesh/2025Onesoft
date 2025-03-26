package com.Junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AssetProgram {
	@Autowired
	Calculatore c;
	Calculatore cc= new Calculatore();
	@Test
	public void testEqual() {
		assertEquals(5,cc.sub());
		//assertEquals(10, c.add(6, 4));
		//assertEquals(10, cc.add(6, 4));
	}
	@Test
	public void testNull() {
		assertNull(null,null);
	}
	@Test
	public void testSame() {
		assertSame("jeeva", "jeeva");
	}
	@Test
	public void testArrayEqual() {
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		assertArrayEquals(a, b);
	}
	@Test
	public void testTrue() {
		assertTrue(10>3);
	}
	@Test
	public void  testnotEqual() {
		assertNotEquals(10, 5);
	}
	@Test
	public void testnotnull() {
		assertNotNull(null,9);
	}
	@Test
	public void testNotSame() {
		assertNotSame("jeeva", "jee");
	}
	@Test
	public void testfalse() {
		assertFalse(10<3);
	}
	
}
