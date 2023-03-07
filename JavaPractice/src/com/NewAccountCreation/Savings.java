package com.NewAccountCreation;

public class Savings extends Accounts{
	
	// Own data with Methods
	
	int sFB_ID;
	int sFB_AccessKey;
	
	public Savings(String name, String ssn, int balance)
	{ 
		super(name, ssn, balance);
		account_Number = 1+account_Number;
		savingsPackInclusions();
	}
	// Also gets methods from Accounts
	
	private void savingsPackInclusions()
	{
		
		sFB_ID = (int)(Math.random()*Math.pow(10, 3));
		sFB_AccessKey = (int)(Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo()
	{
		System.out.println(" Account Type: Saving");
		super.showInfo();
		System.out.println(" Account Number:"+ account_Number);
		System.out.println(" Your Savings feature also includes below "
				+ "\n Safety Feature Box ID: "+sFB_ID+""
				+ "\n Safety Access Key: "+sFB_AccessKey);
		System.out.println("******");
		
	}

}
