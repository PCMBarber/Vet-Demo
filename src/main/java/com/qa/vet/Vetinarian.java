package com.qa.vet;

import java.util.Random;

import com.qa.animals.Animal;

public class Vetinarian {
	
	private Random random = new Random();
	private String[] shop = {"Pet Food", "Collar", "Squeeky Toy", "Scratching Post", "Laser Pointer"};
	
	
	public void fullTreatment(Animal patient) {
		do {
			if (patient.isSick()) {
				patient.treatIllness();
			} else if (patient.isInjured()) {
				patient.treatInjury();
			}
		} while (patient.isSick() || patient.isInjured());
		bill(patient);
	}
	
	public void bill(Animal patient) {
		if(patient.getName().equals("Jeff")) {
			System.out.println("Bill is 6,000,000");
		} else {
			System.out.println("Bill is 60");
		}
	}
	
	public String giftShop() {
		if (random.nextBoolean()) {
			int choice = random.nextInt(5);
			switch (choice) {
			case 0:
				return shop[4];
			case 1:
				return shop[3];
			case 2:
				return shop[2];
			case 3:
				return shop[1];
			case 4:
				return shop[0];
			default:
				return "";
			}
		} else {
			return "";
		}
	}
}
//Treatments
//Bill