package com.wipro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplyLifeCycleTest {
	
	
	
	MultiplyLifeCycle m;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		m= new MultiplyLifeCycle();
	
	}

	@AfterEach
	void tearDown() throws Exception {
		
		m=null;
	}

	@Test
	void test() {
		assertEquals(50,m.multipication(10, 5));
	}

}
