package com.app.employees;
import java.util.*;
public class Salariesemployee extends Employee {
private double weeklySalary;
private String type="weeklysalaried";
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
Scanner sc=new Scanner(System.in);
public Salariesemployee()
{
	super();
}
public void acceptData()
{
	super.acceptData();
	System.out.println("Enter Weekly salary");
	this.weeklySalary=sc.nextInt();
}
public void displayData()
{
	super.displayData();
	System.out.println("Weekly salary = "+this.weeklySalary);
}
public void calculateSalary()
{
	System.out.println("Weekly salary = "+this.weeklySalary);
	
}
}
