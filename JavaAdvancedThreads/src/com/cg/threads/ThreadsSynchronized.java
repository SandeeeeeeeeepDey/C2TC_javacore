// Program to demonstrate synchronized block.
package com.cg.threads;
class Function{
	int count;
	synchronized void increment() { // synchronized block works as to make threads use the function one at a time, eleminating race condition.
	//void increment() { // This gives inconsistent value because, both the threads are using the same function at same time, causing race condition.
		count++;
		
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
		
	}

}
