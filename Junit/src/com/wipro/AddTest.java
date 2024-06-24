package com.wipro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		
		
		Sum sum=new Sum();
		assertEquals(10,sum.addition(5,5));
		
		assertNotNull(sum.addition(3, 4));
		
		
		
	}
	
	@Test
	void testMul() {
		Sum sum=new Sum();
		assertEquals(20,sum.multiply(4, 5));
	}

}
