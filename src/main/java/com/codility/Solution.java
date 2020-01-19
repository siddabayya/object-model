package com.codility;

import com.codility.flyable.FlyAction;
import com.codility.flyable.NoFlyAction;
import com.codility.singable.CluckAction;
import com.codility.singable.DoodleAction;
import com.codility.singable.MeowAction;
import com.codility.singable.QuackAction;
import com.codility.singable.WoofAction;
import com.codility.swimmable.SwimAction;

public class Solution {

	public static void main(String[] args) {

		/***** SOLUTIONS ARE GIVEN BELOW ****/

		// 2) we have 2 special kinds of birds: the Duck and the Chicken.
		birdBehaviors();
		
		// 3) Now how would you model a rooster?
		roosterBehavior();
		
		// 4. Can you model a parrot? We are specifically interested in three parrots,
		parrotsBehavior();

	}

	public static void birdBehaviors() {

		// a. A duck says: "Quack, quack"
		// b. A duck can swim
		System.out.println("--------- Duck ---------");
		Bird duck = new Duck();
		duck.setFlyable(new FlyAction());
		duck.setSingable(new QuackAction());
		duck.setSwimmable(new SwimAction());
		duck.walk();
		duck.fly();
		duck.sing();
		duck.swim();

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

	public static void roosterBehavior() {
		
		// a. A rooster says: "“Cock-a-doodle-doo"
		// b. How is the rooster related to the chicken?
		// c. Can you think of other ways to model a rooster without using inheritance?
		
		System.out.println("--------- Rooster ---------");
		Rooster rooster = new Rooster();
		rooster.setSingable(new DoodleAction());
		rooster.sing();
	}
	
	public static void parrotsBehavior() {
		
		System.out.println("--------- Parrot ---------");
		// a. A parrot living with dogs says: "“Woof, woof"
		Bird parrotWithDogs = new Parrot();
		parrotWithDogs.setSingable(new WoofAction());
		parrotWithDogs.sing();

		// b. A parrot living with cats says: "Meow"
		Bird parrotWithCats = new Parrot();
		parrotWithCats.setSingable(new MeowAction());
		parrotWithCats.sing();

		// c. A parrot living near the rooster says: "Cock-a-doodle-doo"
		Bird parrotWithRooster = new Parrot();
		parrotWithRooster.setSingable(new DoodleAction());
		parrotWithRooster.sing();

		// d. How do you keep the parrot maintainable? What if we need another parrot
		// lives near a Duck? Or near a phone that rings frequently?
		
		// Ans: we can easily extend behaviors with HAS-A relation
		Bird parrotWithDuck = new Parrot();
		parrotWithDuck.setSingable(new CluckAction());
		parrotWithDuck.sing();
	}

}
