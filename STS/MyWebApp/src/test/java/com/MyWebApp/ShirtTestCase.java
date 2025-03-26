package com.MyWebApp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.MyWebApp.Controller.UseShirt;
import com.MyWebApp.Entity.Shirt;

public class ShirtTestCase {
	
    UseShirt controller = new UseShirt();

	@Test
    public void testGetShirt() { 
        List<Shirt> shirts = List.of(
        		new Shirt("otto",350,"yellow",true,54),
                new Shirt("polo",245,"yellow",true,42)
        );

        List<Shirt> result = controller.getShirt(shirts);

        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void testGetMinPrice() {
        List<Shirt> shirts = List.of(
                new Shirt("otto",350,"yellow",true,54),
                new Shirt("polo",245,"yellow",true,42),
                new Shirt("oppo",2345,"yellow",true,22)
        );

        Shirt result = controller.getminprice(shirts); 

        assertNotNull(result);
        assertEquals(245, result.getPrice());
    }

    @Test
    public void testGetMaxPrice() {
        List<Shirt> shirts = List.of(
                new Shirt("otto",350,"yellow",true,54),
                new Shirt("polo",245,"yellow",true,42),
                new Shirt("oppo",2345,"yellow",true,22)
        );

        Shirt result = controller.getmaxprice(shirts); 

        assertNotNull(result);
        assertEquals(2345, result.getPrice());
    }

}