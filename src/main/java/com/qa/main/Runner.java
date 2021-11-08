package com.qa.main;

import com.qa.animals.BeardedDragon;
import com.qa.animals.Dog;
import com.qa.animals.Staffie;
import com.qa.vet.Vetinarian;

public class Runner {
	public static void main(String[] args) {
		Vetinarian app = new Vetinarian();

		Staffie mable = new Staffie("Mable", 10, false, false);
		System.out.println(mable.getCount());
		Staffie mable2 = new Staffie("mable2", 10, true, true);
		
		System.out.println(mable.getCount());
		System.out.println(mable2.getCount());
		
		
		BeardedDragon phil = new BeardedDragon("Phil", 3, true, false, false);
		System.out.println(mable.getCount());
		System.out.println(mable2.getCount());
		System.out.println(phil.getCount());
		// Narrow
//		double myDouble = 6.9;
//		System.out.println("myDouble: "+myDouble);
//		
//		int myInt = (int) myDouble;
//		System.out.println("myDouble: "+myDouble);
//		System.out.println("myInt: "+ myInt);
		
		
		// Widen
//		int myInt = 5;
//		System.out.println("MyInt: "+myInt);
//		
//		long myLong = myInt;
//		System.out.println("MyInt: "+myInt);
//		System.out.println("myLong: "+myLong);
//		
//		float myFloat = myLong;
//		System.out.println("MyInt: "+myInt);
//		System.out.println("myLong: "+myLong);
//		System.out.println("myFloat: "+myFloat);
		
		
	}
}
