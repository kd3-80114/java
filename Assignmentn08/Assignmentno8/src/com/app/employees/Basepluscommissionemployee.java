package com.app.employees;

import java.util.Scanner;

public class Basepluscommissionemployee extends CommisionEmployee 
{
private int baseSalary;
private String type="basepluscommision";
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
Scanner sc=new Scanner(System.in);
public Basepluscommissionemployee()
{
	super();
}
public void acceptData()
{
	super.acceptData();
	System.out.println("Enter base salary");
	this.baseSalary=sc.nextInt();
}
public void calculateSalary()
{
	double salary;
	salary=(this.commisionRate*this.grossSales)+this.baseSalary;
	System.out.println("Salary of base plus commision employee is = "+salary);
}
}
