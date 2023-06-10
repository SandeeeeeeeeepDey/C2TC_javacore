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
		if(isSalaried()) {// ||getAccBal()>MINBAL
			if(withdrawalAmount<=getAccBal()) {
				System.out.println("You have withdrawn: Rs"+withdrawalAmount+" Your current balance is: Rs"+(getAccBal()-withdrawalAmount));
				//setAccBal(getAccBal()-withdrawalAmount);
			}else
				System.out.println("Your current balance is lower than your requested withdrawal amount.");
		}else {
			if(withdrawalAmount<=(getAccBal()-MINBAL)) {
				System.out.println("You have withdrawn: Rs"+withdrawalAmount+" Your current balance is: Rs"+(getAccBal()-withdrawalAmount));
			}else
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
