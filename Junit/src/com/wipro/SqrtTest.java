package com.wipro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SqrtTest {

	@Test
	void testFindSqrt() {
		Sqrt s=new Sqrt();
		assertEquals(25,s.findSqrt(625));
		
	}

}
