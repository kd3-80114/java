package com.app.employees;

import java.util.Scanner;

public class HourlySalaried extends Employee{
private int hourlyWage;
private int hoursWorked;
private String type="hourlySalaried";
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
Scanner sc=new Scanner(System.in);
public HourlySalaried()
{
	super();
}
public void acceptData()
{
	super.acceptData();
	System.out.println("Enter hourly Wage");
	this.hourlyWage=sc.nextInt();
	System.out.println("Enter number of hours worked");
	this.hoursWorked=sc.nextInt();
}
public void calculateSalary()
{
	//System.out.println("Salary of Hourly salried employee is = "+this.hourlyWage*this.hoursWorked);
	double salary=0;
	if(this.hoursWorked<=40)
	{
		salary=this.hourlyWage*this.hoursWorked;
	}
	else if(this.hoursWorked>40)
	{
		salary=40*this.hourlyWage+(this.hoursWorked-40)*this.hourlyWage*1.5;
	}
	System.out.println("Salary of hourly salaried employee is "+salary);
}
}
