// Program to demonstrate Threads
package com.cg.threads;
//A thread is a lightweight process that enables simultaneous execution of two or more parts of a program enabling multitasking.
//Thread class in java works as, Start->Runnable->Running->Terminate.
//Between them there can exist a Running-> Sleep->Resume->Runnable->Running.
			
//Thread can be created in two ways:- 
	// 1: Extend Thread class:
	class SingSong extends Thread{
		public void run() {
			System.out.println("SingSong thread has ID no: "+Thread.currentThread().getId());
			System.out.println("SingSong thread has name: "+Thread.currentThread().getName());
			System.out.println("SingSong thread has priority: "+Thread.currentThread().getPriority());
			System.out.println("SingSong thread has state: "+Thread.currentThread().getState());
			System.out.println("-------------------------------------------------------------------------");
			try {
				sleep(2000); // sleep method, blocks the code for the entered about of time, that is in millisecond, until it resumes.
				System.out.println("3");
				sleep(1000);
				System.out.println(2);
				sleep(1000);
				System.out.println(1);
				sleep(1000);
				System.out.println("SingSong done sleeping");
				System.out.println("-------------------------------------------------------------------------");
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
	}
	class TellStory extends Thread{
		public void run() {
			System.out.println("TellStory thread has ID no: "+Thread.currentThread().getId());
			System.out.println("TellStory thread has name: "+Thread.currentThread().getName());
			System.out.println("TellStory thread has priority: "+Thread.currentThread().getPriority());
			System.out.println("TellStory thread has state: "+Thread.currentThread().getState());
			System.out.println("-------------------------------------------------------------------------");
			try { 
				sleep(2000); // sleep method has to be put inside try catch, because it will throw an exception if it is interrupted.
				System.out.println("TellStory to be interrupted");
				System.out.println("is TellStory class running? : "+this.isAlive()); // isAlive() is used to check is current class is running
				sleep(1000);
				System.out.println("3");
				sleep(1000);
				System.out.println(2);
				sleep(1000);
				System.out.println(1);
				sleep(1000);
				this.interrupt(); // This is the method that interrupts a sleep method.
				sleep(1000);
				System.out.println("TellStory");
			} catch (InterruptedException err) {
				System.out.println("TellStory " + err);
			}
		}
	}
	// 2: Implement Runnable interface:
	class TeachALesson implements Runnable{
		public void run() {
			System.out.println("TeachALesson thread has ID no: "+Thread.currentThread().getId());
			System.out.println("TeachALesson thread has name: "+Thread.currentThread().getName());
			System.out.println("TeachALesson thread has priority: "+Thread.currentThread().getPriority());
			System.out.println("TeachALesson thread has state: "+Thread.currentThread().getState());
			System.out.println("-------------------------------------------------------------------------");
		}

		
	}
	class Entertain implements Runnable{
		public void run() {
			System.out.println("Entertain thread has ID no: "+Thread.currentThread().getId());
			System.out.println("Entertain thread has name: "+Thread.currentThread().getName());
			System.out.println("Entertain thread has priority: "+Thread.currentThread().getPriority());
			System.out.println("Entertain thread has state: "+Thread.currentThread().getState());
			System.out.println("-------------------------------------------------------------------------");
			
			
		}
		
	}
	
	
public class ThreadsDemo {
	public static void main(String[] args) {
		// Calling thread using 1st method.
		SingSong s=new SingSong();
		s.start(); // Start will initiate the thread and also call the run() method.
		s.setPriority(Thread.currentThread().MAX_PRIORITY); // We can set priority to max(10), min(1) or norm(5) priority in a similar way.
		s.setName("SingSong"); // We can set a name to the thread to help us while multithreading.
		try {
			s.join(7000); // We use join method to block the next class for provided amount of time, to let current class execute its tasks.
			System.out.println("Using join to block all next functions for atmost given time till the class completes all its task.");
		} catch (InterruptedException er) {
			System.out.println("Join Method Interrupted "+ er);
		}
// -------------------------------------------------------------------------		
		TellStory t=new TellStory();
		t.start();
		t.setPriority(5); // We can also set priority between 1-10 giving integer value.

//--------------------------------------------------------------------------------------------------------------------		
		// Calling thread using 2nd method.
		TeachALesson l=new TeachALesson(); // Runnable interface is a functional interface, and it has only one function, that is: run().
		Thread thread=new Thread(l); // Without starting, we cant run a thread in real life, hence we put the runnable class inside a Thread class.
		thread.start(); // then we start the thread with runnable class as an argument to start and run the thread.
		thread.setPriority(1); // We can provide priority, but at the end, the JVM decides what the priority will be.
		
//--------------------------------------------------------------------------		
		Entertain e=new Entertain();
		Thread threadOne=new Thread(e);
		threadOne.start();
		threadOne.setPriority(7);
		
		System.out.println("main thread has ID no: "+Thread.currentThread().getId());
	}

}
