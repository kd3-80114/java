package com.creditcalculator.calc;

public class Creditcalculator {
	private int accountNo;
	private int beginningBalance;
	private int itemsCharged;
	private int totalCredits;
	private int creditLimit;
	public Creditcalculator(int accountNo,int beginningBalance,int itemsCharged,int totalCredits,int creditLimit)
	{
		this.accountNo=accountNo;
		this.beginningBalance=beginningBalance;
		this.itemsCharged=itemsCharged;
		this.totalCredits=totalCredits;
		this.creditLimit=creditLimit;
		
	}
	public void calculateCreditLimit()
	{
		int newBalance;
		newBalance=this.beginningBalance+this.itemsCharged-totalCredits;
		//System.out.println("New Balance = "+newBalance);
		if(newBalance>this.creditLimit)
		{
			System.out.println("Credit limit exceded");
		}
		else
		{
			System.out.println("New Balance = "+newBalance);
		}
		//Creditlimt credit=new Creditlimt(555,500,25,400,300);

	}

}
