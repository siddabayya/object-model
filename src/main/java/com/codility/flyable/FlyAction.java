package com.codility.flyable;

public class FlyAction implements Flyable {

	@Override
	public String fly() {
		String fly = "I am flying..";
		
		System.out.println(fly);
		return fly;
	}

}
