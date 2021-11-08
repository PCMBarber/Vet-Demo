package com.qa.animals;

public class Animal {
	
	private String name;
	private int age;
	private boolean sick;
	private boolean injured;
	
	private static int count = 0;
	
	public Animal(String name, int age, boolean sick, boolean injured) {
		super();
		this.name = name;
		this.age = age;
		this.sick = sick;
		this.injured = injured;
		count++;
	}
	
	public void treatIllness() {
		if (this.sick) {
			setSick(false);
		} else {
			setSick(true);
		}
	}
	
	public void treatInjury() {
		if (this.injured) {
			setInjured(false);
		} else {
			setInjured(true);
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSick() {
		return sick;
	}

	public void setSick(boolean sick) {
		this.sick = sick;
	}

	public boolean isInjured() {
		return injured;
	}

	public void setInjured(boolean injured) {
		this.injured = injured;
	}
}
