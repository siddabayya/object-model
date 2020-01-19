package com.codility;

import com.codility.flyable.Flyable;
import com.codility.singable.Singable;
import com.codility.walkble.WalkAction;
import com.codility.walkble.Walkble;

class Bird extends Animal {

	protected Singable singable;
	protected Flyable flyable;

	Bird() {
		this.walkble = new WalkAction();
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public Flyable getFlyable() {
		return flyable;
	}

	public Singable getSingable() {
		return singable;
	}

	public void setSingable(Singable singable) {
		this.singable = singable;
	}

	public void sing() {
		this.singable.sing();
	}

	public void fly() {
		this.flyable.fly();
	}
}

class Duck extends Bird implements Singable, Flyable, Walkble {

}

class Chicken extends Bird implements Singable, Walkble {

}
