package com.cg.thispassesasargumentinmethod;

public class CarForDemo {
	// Here we made a Method startEngine, which created an instance of the engine object and
	// provides its turnOn method with all data there is from CarForDemo class.
	
		protected String model;
		protected int time;
		
		public CarForDemo(String model, int time) {
			this.model=model;
			this.time=time;
		}
		
		public void startEngine() {
			EngineForDemo e=new EngineForDemo();
			e.turnOn(this); // The type of data turnOn() method is getting is,
							// type of the class, which means, all data available in
		}
	}

