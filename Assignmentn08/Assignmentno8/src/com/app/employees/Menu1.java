package com.app.employees;
import java.util.Scanner;

public class Menu1 {
	private int choice;
	public int chooseMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 0 to exit");
		System.out.println("Enter 1 to add Weekly salaried employees");
		System.out.println("Enter 2 to calculate salary of weekly salaried employees");
		System.out.println("Enter 3 to add hourly salaried employees");
		System.out.println("Enter 4 to calculate salary of hourly salaried employees");
		System.out.println("Enter 5 to add commision employee");
		System.out.println("Enter 6 to calculate salary of commision employee");
		System.out.println("Enter 7 to add base plus commision employee");
		System.out.println("Enter 8 to calculate salary of base plus commision employee");
		choice=sc.nextInt();
		return choice;
	}
	
}


