package com.app;
import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private int ssn;
	
	Scanner sc=new Scanner(System.in);
	
	public Employee()
	{
		this("","",0);
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
	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ssn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return ssn == other.ssn;
	}
	
	

}



