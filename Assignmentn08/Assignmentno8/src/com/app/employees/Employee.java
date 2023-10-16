package com.app.employees;

import java.util.Scanner;

abstract public class Employee {
	private String firstName;
	private String lastName;
	private int ssn;
	
	Scanner sc=new Scanner(System.in);
	abstract public String getType();
	public Employee()
	{
		this("Ro","Pa",225);
	}
	public Employee(String firstName,String lastName,int ssn)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.ssn=ssn;
	}
	 public void acceptData()
	 {
		 System.out.println("Enter First Name");
		 this.firstName=sc.next();
		 System.out.println("Enter Last Name");
		 this.lastName=sc.next();
		 System.out.println("Enter social security Number(ssn)");
		 this.ssn=sc.nextInt();
		 
	 }
	 public void displayData()
	 {
		 System.out.println("First Name  = "+this.firstName );
		 System.out.println("Last Name  = "+this.lastName );
		 System.out.println("Social security Number = "+this.ssn);
		 
	 }
	abstract public void calculateSalary();
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
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
