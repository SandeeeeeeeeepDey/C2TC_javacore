package com.cg.basicsthree;

public class ConstructorDemoUserDefinedTypeExample {
	private String task;
	private String example;
	private int num;
	private int numTwo;
	private long number;
	public ConstructorDemoUserDefinedTypeExample(String task, String example, int num, long number) {
		this.task="Demonstrate Pre-defined objects that change with datatype";
		this.example="two strings, one int and one long constructor activated";
		this.num=1;
		this.number=1L;
	}
	public ConstructorDemoUserDefinedTypeExample(String task, String example, int num, int numTwo) {
		this.task="Demonstrate Pre-defined objects that change with datatype";
		this.example="two strings and two int constructor activated";
		this.num=2;
		this.numTwo=22;
	}
	public ConstructorDemoUserDefinedTypeExample(String task, String example, int num) {
		this.task="Demonstrate Pre-defined objects that change with number of Parameters";
		this.example="two strings and one int constructor activated";
		this.num=3;
		
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getExample() {
		return example;
	}
	public void setExample(String example) {
		this.example = example;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNumTwo() {
		return numTwo;
	}
	public void setNumTwo(int numTwo) {
		this.numTwo = numTwo;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	// if datatype and number of parameters are same for two constructors, 
	// error of duplicity will arrive to avoid constructor overloading.
}
