package com.gominc.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HomeControllerTest {
	
	@Test
	public void testSum() {
		HomeController homeController = new HomeController();
		int result = homeController.sum(10, 20);
		assertEquals(20, result, 10);		
	}
	
}
