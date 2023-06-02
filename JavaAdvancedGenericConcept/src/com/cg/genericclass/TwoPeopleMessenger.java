package com.cg.genericclass;
//
import java.util.*;

public class TwoPeopleMessenger<T> { //messanger
//	String msg= super.messege;
 //String[] Marray= {super.messege()};
	T personOne;
	T personTwo;
	static Thread t;
	List<String> messeges;
	
	TwoPeopleMessenger(T pOne,T pTwo){
		personOne=pOne;
		personTwo=pTwo;
		messeges=new ArrayList<>();
	}

	public void sendMessege(String messege) {
		messeges.add(messege);
		
	}
	public void showMesseges() {
		t=new Thread(new Runnable(){
			
			@Override
			public void run() {
				for(String s:messeges) {
					System.out.println(personOne+" sent: ["+s+"] to: "+personTwo);
					try {
						TwoPeopleMessenger.t.sleep(2000);
					} catch (Exception e) {}
				}
				
			}
		});
		t.start();
//		for(String s:messeges) {
//		System.out.println(personOne+" sent: ["+s+"] to: "+personTwo);
//		
		}
	}
	
	


