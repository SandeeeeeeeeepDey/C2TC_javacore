package com.cg.moneymoneybank.application;

import com.cg.moneymoneybank.framework.SavingAcc;
// Concrete class for SavingAcc
public class MMSavingAcc extends SavingAcc {

//-------------------------------------------------------MINBAL
	private static final float MINBAL=100;
	public static float getMinbal() {
		return MINBAL;
	}
	
//-------------------------------------------------------Constructor()
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);	
	}
	
//-------------------------------------------------------withdraw()
	@Override
	public void withdraw(float withdrawalAmount) {
		
		if(isSalaried()) { // If isSalaried is true MINBAL will not be considered
			
			if(withdrawalAmount<=getAccBal()) { // Client has enough balance
				System.out.println("You have withdrawn: Rs"+withdrawalAmount+". Your account balance is: Rs"+(getAccBal()-withdrawalAmount));
			}else // if isSalaried is true, but client does'nt have enough balance
				System.out.println("Your current balance is lower than your requested withdrawal amount.");
			
		}else {// If isSalaried is false MINBAL will be considered
			
			if(withdrawalAmount<=(getAccBal()-MINBAL)) { // Client withdraws amount maintaining MINBAL
				System.out.println("You have withdrawn: Rs"+withdrawalAmount+". Your current balance is: Rs"+(getAccBal()-withdrawalAmount));
			}else // Client request amount without maintaining MINBAL
				System.out.println("Your requested withdrawal amount is more than allowed amount to be withdrawn.");
		}
	}

//-------------------------------------------------------toString()
	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


	

}
