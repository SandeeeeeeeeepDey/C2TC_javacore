package com.cg.genericclass;
// Messenger class to demonstrate what we can do using Generic
import java.util.*;

public class TwoPeopleMessenger<T> { 
	
	// Person instance to display name in methods outside local scope
	T personOne;
	T personTwo;
	static Thread t; // sleep method is static and static keyword can only be used in class level. thats Why I had to declare it here and then implement it inside the method.
	List<String> messeges; // to use messeges outside method or constructor scope.
	
	// Taking in the person info using the constructor and also making Lists for each instance.
	TwoPeopleMessenger(T pOne,T pTwo){
		personOne=pOne;
		personTwo=pTwo;
		messeges=new ArrayList<>();
	}
	
	// Method to send message.
	public void sendMessege(String messege) {
		messeges.add(messege);
		
	}
	
	// Method to display conversations.
	public void showMesseges() {
		// Used threads to get a more organized sequential display.
		t=new Thread(new Runnable(){	
			@Override
			public void run() {
				for(String s:messeges) {
					System.out.println(personOne+" sent: ["+s+"] to: "+personTwo);
					try {
						TwoPeopleMessenger.t.sleep(1500);
						// Thread.sleep(00);// Could have also used sleep in this way
					} catch (Exception e) {}
				}
			}
			
		});
		t.start();	
		}
	
}
	
	


