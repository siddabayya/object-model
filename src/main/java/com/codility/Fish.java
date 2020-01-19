package com.codility;

import com.codility.swimmable.SwimAction;
import com.codility.swimmable.Swimmable;

abstract class Fish extends Animal implements Swimmable {

	protected Swimmable swimmable;

	Fish(){
		this.swimmable = new SwimAction();
	}
	@Override
	public void swim() {
		this.swimmable.swim();
	}

	public Swimmable getSwimmable() {
		return swimmable;
	}

	public void setSwimmable(Swimmable swimmable) {
		this.swimmable = swimmable;
	}

	abstract void genre(); // Abstract method for specialization 
}

class Shark extends Fish {

	@Override
	void genre() {
		System.out.println("We are large and grey & we eat other fish");
	}

}

class Clownfish extends Fish {

	@Override
	void genre() {
		System.out.println("We are small and colourful (orange) & we make jokes");

	}
}

class Dolphin extends Animal implements Swimmable {

	protected Swimmable swimmable;

	@Override
	public void swim() {
		this.swimmable.swim();
	}

	public Swimmable getSwimmable() {
		return swimmable;
	}

	public void setSwimmable(Swimmable swimmable) {
		this.swimmable = swimmable;
	}
}