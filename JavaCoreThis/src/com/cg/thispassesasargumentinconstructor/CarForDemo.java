package com.cg.thispassesasargumentinconstructor;

// Here in this class, I have demonstrated how to use "this" as an argument 
// in the constructor for EngineForDemo class

public class CarForDemo {
	
	protected String model;
	protected int time;
	protected String type;
	
	public CarForDemo(String model, int time) {
		this.model=model;
		this.time=time;
		if(time>7) {
			type="electric";
		}else {
			type="combustion";
		}
		EngineForDemo e=new EngineForDemo(this); // here the data from CarForDemo class is
												 // passed to the constructor of EngineFordemo
		
		
	}
	
	
}