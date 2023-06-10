package com.cg.moneymoneybank.application;
import com.cg.moneymoneybank.framework.BankFactory;
import com.cg.moneymoneybank.framework.CurrentAcc;
import com.cg.moneymoneybank.framework.SavingAcc;

// Concrete class of BankFactory class.
public class MMBankFactory implements BankFactory {

	// SavingAcc instantiation through getNewSavingAcc()
	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) { // implementation of getNewSavingAcc(), returns an instance of SavingAcc.
		SavingAcc savingAcc= new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return savingAcc;
		
	}
	
	// CurrentAcc instantiation through getNewCurrentAcc()
	@Override
	public CurrentAcc getNewCurrentAcc (int AccNo, String accNm,float accBal, float creditLimit) { // implementation of getNewCurrentAcc(), returns an instance of CurrentAcc.
		CurrentAcc CurrentAcc= new MMCurrentAcc(AccNo, accNm, accBal, creditLimit); 
		return CurrentAcc;
		
	}

	
	
	
}
