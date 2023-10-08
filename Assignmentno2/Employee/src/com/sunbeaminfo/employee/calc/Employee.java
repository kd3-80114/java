package com.sunbeaminfo.employee.calc;

import java.util.Scanner;

public class Employee {
	String firstName;
	String lastName;
	double salary;
	public Employee()
	{
		this("emo","emp",0.0);
		
	}
	public Employee(String firstName,String lastName,double salary)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	public void accept()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first name");
		firstName=scanner.next();
		System.out.println("Enter Last name");
		lastName=scanner.next();
		System.out.println("Enter Mounthly Salary");
		if(salary>0)
		salary=scanner.nextInt();		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void calculateYearlySalary()
	{
		System.out.println("Yearly salary of "+firstName+" "+lastName+" is "+salary*12);
	}
	
}
