package com.qa.animals;

public class Staffie extends Dog {
	
	private String headType = "He thicc";

	public Staffie(String name, int age, boolean sick, boolean injured) {
		super(name, age, sick, injured);
	}
	
	public static void noise() {
		System.out.println("Bork");
	}
	
}
