package com.codility;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.codility.flyable.NoFlyAction;
import com.codility.swimmable.SwimAction;

public class BirdTest {
	
	Bird bird;

	@Before
	public void setUp() throws Exception {
		bird = new Duck();
	}

	@Test
	public void testDuck() {
		bird.setSwimmable(new SwimAction());
		assertEquals("I am swimming", bird.swim());
	}
	
	@Test
	public void testChicken() {
		bird = new Chicken();
		bird.setFlyable(new NoFlyAction());
		assertEquals("", bird.fly());
	}
	
	

}
