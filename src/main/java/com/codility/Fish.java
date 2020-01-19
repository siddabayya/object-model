package com.codility;

import com.codility.swimmable.SwimAction;
import com.codility.swimmable.Swimmable;

abstract class Fish extends Animal implements Swimmable {

	Fish(){
		this.swimmable = new SwimAction();
	}

	@Override
	public String walk() {
		return ""; // Can throw exception
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
	
}