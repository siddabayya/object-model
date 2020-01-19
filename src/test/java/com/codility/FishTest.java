package com.codility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codility.swimmable.SwimAction;

public class FishTest {
	
	Fish fish;

	@Before
	public void setUp() throws Exception {
		
		fish = new Clownfish(); 
	}

	@Test
	public void testClownfish() {
		fish.setSwimmable(new SwimAction());
		assertEquals("I am swimming", fish.swim());
	}

	@Test
	public void testClownfishThrow() {
		assertNotEquals("I am walking", fish.walk());
	}

}
