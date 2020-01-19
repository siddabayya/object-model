package com.codility;

import com.codility.walkble.Walkble;

public class Animal {

	protected Walkble walkble;

	public Walkble getWalkble() {
		return walkble;
	}

	public void setWalkble(Walkble walkble) {
		this.walkble = walkble;
	}
	public void walk() {
		this.walkble.walk();
	}
}