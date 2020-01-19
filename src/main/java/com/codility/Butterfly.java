package com.codility;

import com.codility.flyable.Flyable;
import com.codility.walkble.Walkble;

public class Butterfly extends Animal implements Flyable, Walkble {

	private Flyable flyable;

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	@Override
	public String fly() {
		return this.flyable.fly();

	}


}
