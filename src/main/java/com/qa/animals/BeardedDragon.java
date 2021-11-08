package com.qa.animals;

public class BeardedDragon extends Animal {
	
	private boolean venomGlans;

	public BeardedDragon(String name, int age, boolean sick, boolean injured, boolean venomGlans) {
		super(name, age, sick, injured);
		this.venomGlans = venomGlans;
	}

}
