package com.cg.genericclass;

public class Driver {

	public static void main(String[] args) {
		// Person class initializing/Instantiating
		Person san=new Person("Sandeep Dey",23);
		Person bat=new Person("Bat Man",35);
		
		// Messenger app instantiating
		TwoPeopleMessenger mFromSanToBat=new TwoPeopleMessenger(san,bat);
		TwoPeopleMessenger mFromBatToSan=new TwoPeopleMessenger(bat,san);
		
		// Conversation
		mFromSanToBat.sendMessege("Hello! How are you?");
		mFromBatToSan.sendMessege("Im fine, and you?");
		mFromSanToBat.sendMessege("Im fine too.");
		mFromBatToSan.sendMessege("How was your day today?");
		mFromSanToBat.sendMessege("Very nice, It was productive, Wbu?");
		mFromBatToSan.sendMessege("Life of a Vigilant, you know how it goes ;)");

		// Display of the above conversation.
		mFromSanToBat.showMesseges();
		mFromBatToSan.showMesseges();
		
	}

}
