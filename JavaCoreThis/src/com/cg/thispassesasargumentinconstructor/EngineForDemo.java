package com.cg.thispassesasargumentinconstructor;

// Here EngineForDemo class is getting all data from the current class object and 
// it can destructure and use any of the data.

public class EngineForDemo {
	public EngineForDemo(CarForDemo car) {
		System.out.println("Your "+car.model+" "+car.type+" engines are Starting in "+car.time+" minutes");
		}
}