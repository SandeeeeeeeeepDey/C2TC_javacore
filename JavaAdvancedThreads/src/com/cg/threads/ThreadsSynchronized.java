// Program to demonstrate synchronized block.
package com.cg.threads;
import java.util.*;
// Increment function 
class Function{
	int count;
	synchronized void increment() { // synchronized block works as to make threads use the function one at a time, eliminating race condition.
	//void increment() { // This gives inconsistent value because, both the threads are using the same function at same time, causing race condition.
		count++;
		
	}
}

// Dummy Database 
class DummyData{
	static ArrayList<String> ranString= new ArrayList<>();
	
		static {
			ranString.add("Letter");
			ranString.add("Rabbits");
			ranString.add("Front");
			ranString.add("Nerve");
			ranString.add("Cars");
			ranString.add("Rabbits");
			ranString.add("Cars");
			ranString.add("Tiger");
			ranString.add("Cart");
			ranString.add("Name");
			ranString.add("Pail");
			ranString.add("Comparison");
			ranString.add("Love");
			ranString.add("Property");
			ranString.add("Speaker");
			ranString.add("Comparison");
			ranString.add("Barrel");
			ranString.add("Railway");
			ranString.add("Hood");
			ranString.add("Pudding Stone Protector");
		}
		 synchronized String dummyData() {
			return ranString.get((int)((Math.random()*20)));
		}

	
}

public class ThreadsSynchronized {

	public static void main(String[] args) {
		// Function class instantiation
		Function inc=new Function();
		
		// First thread instantiation.
		Thread t=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<100;i++)
				inc.increment(); // using increment function.
				System.out.println(inc.count);
			}
			
		});
		// Second thread instantiation.
		Thread tOne=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<100;i++)
				inc.increment(); // also using same increment function.
				System.out.println(inc.count);
			}
			
		});
		t.start();
		tOne.start();
		//System.out.println("==================================================================================================");
		DummyData data=new DummyData();
		Thread egOne= new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
				System.out.println(i+": "+data.dummyData());
				}
			}
		});
		Thread egTwo=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++) {
				System.out.println(i+": "+data.dummyData());
				}
				
			}
			
		});
		egOne.start();
		egTwo.start();
		
		
	}

}
