package com.codility;

import com.codility.flyable.FlyAction;
import com.codility.flyable.Flyable;
import com.codility.flyable.NoFlyAction;
import com.codility.singable.CluckAction;
import com.codility.singable.DoodleAction;
import com.codility.singable.MeowAction;
import com.codility.singable.QuackAction;
import com.codility.singable.Singable;
import com.codility.singable.WoofAction;
import com.codility.swimmable.SwimAction;
import com.codility.swimmable.Swimmable;
import com.codility.walkble.NoWalkAction;
import com.codility.walkble.WalkAction;
import com.codility.walkble.Walkble;

public class Solution {

	public static void main(String[] args) {

		/***** SOLUTIONS ARE GIVEN BELOW ****/

		// 2) we have 2 special kinds of birds: the Duck and the Chicken.
		birdBehaviors();
		
		// 3) Now how would you model a rooster?
		roosterBehavior();
		
		// 4. Can you model a parrot? We are specifically interested in three parrots,
		parrotsBehavior();
		
		// B. Model fish as well as other swimming animals
		fishBehaviors();
		
		// D. Model animals (Butterfly) that change their behavior over time
		butterflyBehaviors();
		
		// E. Counting animals
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Shark(), new Clownfish(), new Dolphin(), new Butterfly() };
		
		countAnimalByBehaviors(animals);

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
	
	public static void fishBehaviors() {
		
		System.out.println("--------- Shark ---------");
		Fish shark = new Shark();
		// shark.sing(); // No sing
		// shark.walk(); // No walk
		shark.swim();
		// a. Sharks are large and grey
		// d. Sharks eat other fish
		shark.genre();

		System.out.println("--------- Clownfish ---------");
		Fish clownfish = new Clownfish();
		// clownfish.sing(); // No sing
		// clownfish.walk(); // No walk
		clownfish.swim();
		// c. Clownfish make jokes
		// b. Clownfish are small and colorful (orange)
		clownfish.genre();
		
		System.out.println("--------- Dolphin ---------");
		// 3. Dolphins are not exactly fish, yet, they are good swimmers
		Dolphin dolphin = new Dolphin();
		dolphin.setSwimmable(new SwimAction());
		dolphin.swim();
	}
	
	public static void butterflyBehaviors() {
		
		System.out.println("--------- Butterfly ---------");
		Butterfly butterfly = new Butterfly();
		
		// 1. Can you model a butterfly?
		// a. A butterfly can fly
		// b. A butterfly does not make a sound
		butterfly.setFlyable(new FlyAction());
		butterfly.setWalkble(new NoWalkAction());
		butterfly.fly();
		butterfly.walk(); // No Walk

		// Change their behavior over time
		// a. A caterpillar cannot fly
		// b. A caterpillar can walk (crawl)
		System.out.println("--------- Caterpillar ---------");
		butterfly.setFlyable(new NoFlyAction());
		butterfly.setWalkble(new WalkAction());
		butterfly.fly(); // No fly
		butterfly.walk();
	}

	public static void countAnimalByBehaviors(Animal[] animals) {

		int flyCount = 0;
		int walkCount = 0;
		int swimCount = 0;
		int singCount = 0;

		for (Animal animal : animals) {

			if (animal instanceof Flyable) {
				flyCount++;
			} 
			if(animal instanceof Walkble) {
				walkCount++;
			}
			if(animal instanceof Swimmable) {
				swimCount++;
			}
			if(animal instanceof Singable) {
				singCount++;
			}

		}
		
		System.out.println("flyCount= "+ flyCount + " walkCount= "+ walkCount + " swimCount= "+ swimCount + " singCount= "+ singCount );
	}
}
