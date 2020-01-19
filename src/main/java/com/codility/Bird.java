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

	public String sing() {
		return this.singable.sing();
	}

	public String fly() {
		return this.flyable.fly();
	}
}

class Duck extends Bird implements Singable, Flyable, Walkble {

}

class Chicken extends Bird implements Singable, Walkble {

}

class Rooster extends Animal implements Singable, Walkble {
	public Singable singable;

	public void setSingable(Singable singable) {
		this.singable = singable;
	}

	@Override
	public String sing() {
		return this.singable.sing();

	}
}

class Parrot extends Bird implements Singable, Flyable, Walkble {

}
