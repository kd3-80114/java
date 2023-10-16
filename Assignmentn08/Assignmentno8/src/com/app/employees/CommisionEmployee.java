package com.app.employees;

import java.util.Scanner;

public class CommisionEmployee extends Employee
{
	protected int grossSales;
	protected int commisionRate;
	private String type="commisioned";
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	Scanner sc=new Scanner(System.in);
	public CommisionEmployee()
	{
		super();
	}
	public void acceptData()
	{
		super.acceptData();
		System.out.println("Enter gross Sales");
		this.grossSales=sc.nextInt();
		System.out.println("Enter commision rate");
		this.commisionRate=sc.nextInt();
	}
	public void calculateSalary()
	{ 
		System.out.println("Salary of Commision Employee is"+this.grossSales*this.commisionRate);	
	}
}
