// Here, there are only methods that are meant to be abstract and public, so I used Interface instead of Abstract.
package com.cg.moneymoneybank.framework;

public interface BankFactory { // This is an implementable class.

	SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried); // Method that returns SavingAcc type object.
	
	CurrentAcc getNewCurrentAcc (int AccNo, String accNm,float accBal, float creditLimit); // Method that returns CurrentAcc type object.
}
