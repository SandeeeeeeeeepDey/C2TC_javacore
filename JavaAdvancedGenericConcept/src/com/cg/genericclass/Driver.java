package com.cg.genericclass;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person san=new Person("Sandeep Dey",23);
		Person bat=new Person("Bat Man",35);
		TwoPeopleMessenger mFromSanToBat=new TwoPeopleMessenger(san,bat);
		TwoPeopleMessenger mFromBatToSan=new TwoPeopleMessenger(bat,san);
		mFromSanToBat.sendMessege("Hello! How are you?");
		mFromBatToSan.sendMessege("Im fine, and you?");
		mFromSanToBat.sendMessege("Im fine too.");
		mFromBatToSan.sendMessege("How was your day today?");
		mFromSanToBat.sendMessege("Very nice, It was productive, Wbu?");
		mFromBatToSan.sendMessege("Life of a Vigilant, you know how it goes ;)");

		
		mFromSanToBat.showMesseges();
		mFromBatToSan.showMesseges();
		
	}

}
