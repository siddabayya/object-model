package com.codility;

import com.codility.swimmable.Swimmable;
import com.codility.walkble.Walkble;

public class Animal {

	protected Walkble walkble;
	protected Swimmable swimmable;

	public Walkble getWalkble() {
		return walkble;
	}

	public void setWalkble(Walkble walkble) {
		this.walkble = walkble;
	}
	
	public Swimmable getSwimmable() {
		return swimmable;
	}

	public void setSwimmable(Swimmable swimmable) {
		this.swimmable = swimmable;
	}

	public void walk() {
		this.walkble.walk();
	}
	
	public void swim() {
		this.swimmable.swim();
	}
}