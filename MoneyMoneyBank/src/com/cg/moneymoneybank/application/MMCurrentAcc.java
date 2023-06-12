package com.cg.moneymoneybank.application;
import com.cg.moneymoneybank.framework.CurrentAcc;

// Concrete class for CurrentAcc
public class MMCurrentAcc extends CurrentAcc {
	
//--------------------------------------------------constructor()
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}
//--------------------------------------------------Lazy initializer method: LazycreditLimitInitializer(float)	
	@Override
	public float LazycreditLimitInitializer(float amount)  { // Method that decides value for CreditLimit
		return (getAccBal()>= 2 * amount) ? amount : 0f; // creditBal is 0, until accBal is more than equal to double the creditLimit initialized.
	}
	
//--------------------------------------------------withdraw()	
	@Override
	public void withdraw(float withdrawalAmount) {
		
		if(withdrawalAmount<=getAccBal())  // Do not have to use credit
			System.out.println("You have withdrawn: Rs"+withdrawalAmount+" Your current balance is: Rs"+(getAccBal()-withdrawalAmount)+" And your credit balance is:"+getCreditLimit());
			
		else { // Have to use credit
			
			float totalBal=getAccBal()+getCreditLimit(); // Total amount can withdraw
			
			if(withdrawalAmount<=totalBal) { // If can withdraw 
				System.out.println("You have withdrawn: Rs"+withdrawalAmount+". Your current balance is: Rs"+(getAccBal()-withdrawalAmount)+" and your credit balance is: Rs"+(totalBal-withdrawalAmount));
			}else {
				System.out.println("The requested amount is exeeding your current account balance and credit limit");
			}	
		}	
	}

//-------------------------------------------------toString()
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	


	
	

}
