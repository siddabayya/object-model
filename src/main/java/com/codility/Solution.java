package com.codility;

import com.codility.flyable.FlyAction;
import com.codility.flyable.NoFlyAction;
import com.codility.singable.CluckAction;
import com.codility.singable.QuackAction;

public class Solution {

	public static void main(String[] args) {
		
		/***** SOLUTIONS ARE GIVEN BELOW  ****/
		
		// 2) we have 2 special kinds of birds: the Duck and the Chicken.
		birdBehaviors();

	}
	
	public static void birdBehaviors() {
		
		// a. A duck says: "Quack, quack"
		// b. A duck can swim
		System.out.println("--------- Duck ---------");
		Bird duck = new Duck();
		duck.setFlyable(new FlyAction());
		duck.setSingable(new QuackAction());
		duck.walk();
		duck.fly();
		duck.sing();

		
		// c. A chicken says: "“Cluck, cluck"
		// d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
		System.out.println("--------- Chicken ---------");
		Bird chicken = new Chicken();
		chicken.setFlyable(new NoFlyAction()); // No Fly
		chicken.setSingable(new CluckAction());
		chicken.walk();
		chicken.fly(); // No Fly
		chicken.sing();
	}

}
