package com.cg.moneymoneybank.client;
import com.cg.moneymoneybank.framework.*;
import com.cg.moneymoneybank.application.*;
public class Client {

	public static void main(String[] args) {
//----------------------------------------------------------BankFactory Instantiation
		BankFactory bankFactory=new MMBankFactory();
		//bankFactory.getNewCurrentAcc(0000007, "Ronaldo", 3f, 5f).withdraw(7);
		//bankFactory.getNewSavingAcc(0000006, "Lionel", 34f, true).withdraw(23); // Because although we can instantiate but we can't use variables of an instance if we don't store the instances.
		
//----------------------------------------------------------SavingAcc instantiation
		SavingAcc savingAcc=new MMSavingAcc(0000007, "Einstine", 34F, true); // isSalary --> MINBAL=0F
		savingAcc.withdraw(savingAcc.getAccBal()); // Lazy binding of method
		SavingAcc savingAccTwo=new MMSavingAcc(0000006, "Faraday", 34F, false); // isSalary --> MINBAL=100F
		savingAccTwo.withdraw(savingAcc.getAccBal());
		
//----------------------------------------------------------CurrentAcc instantiation
		CurrentAcc currentAcc=new MMCurrentAcc(0000004, "Feynman", 7F, 3F); // accBal>=creditLimi --> creditLimit=3F
		currentAcc.withdraw(currentAcc.getAccBal()); // Lazy binding of method
		CurrentAcc currentAccTwo=new MMCurrentAcc(0000005, "Leodardo", 7F, 6F); // accBal<=creditLimit --> creditLimit=0F
		currentAccTwo.withdraw(currentAcc.getAccBal());

	}
}
