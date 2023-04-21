package com.cg.thispassesasargumentinmethod;

public class EngineForDemo {
	// Here the turnOn() method takes the data of CarForDemo type,
	// which means, it can use the data set from CarForDemo to access data, 
	// like done in the example.
	public void turnOn(CarForDemo car) { // here, car is of CarForDemo class type,
		                                 // similar to how we use String data type.
		
		System.out.println("Your "+car.model+" engines are Starting in "+car.time+" minutes");
		
		}
}
