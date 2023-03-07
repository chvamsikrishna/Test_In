package com.NewAccountCreation;

public abstract class Accounts {
	
	// Common Methods which are used in both Savings and Checking 
	String name;
	String ssn;
	int balance;
	String account_Number;
	double rate;
	
	static int unique = 12345;

	
	
	
	public Accounts(String name, String ssn, int balance)
	{
		this.name = name;
		this.ssn = ssn;
		this.balance = balance;
		this.account_Number = acc_Number();
	
	}
	
	
	private String acc_Number()
	{
	    
		String ssn_Last2 = ssn.substring(ssn.length()-2, ssn.length());
		String val_Unique = Integer.toString(unique++);
		int value = (int) (Math.random()*Math.pow(10, 3));
		
		return ssn_Last2+val_Unique+value ;
		
	}
	
	public void showInfo()
	{
		System.out.println(" NAME: "+name+" \n SSN: "+ssn+"\n BALANCE "+balance);
		
	}
	

}
