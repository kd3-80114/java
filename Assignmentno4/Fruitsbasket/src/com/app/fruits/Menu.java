package com.app.fruits;
import java.util.Scanner;

public class Menu {
	private int choice;
	public int chooseMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 0 to exit");
		System.out.println("Enter 1 to add Mango to fruit basket");
		System.out.println("Enter 2 to add Orange to fruit basket");
		System.out.println("Enter 3 to add Apple to fruit basket");
		System.out.println("Enter 4 to display names of all fruits in basket");
		System.out.println("Enter 5 to display name,color,weight and taste of Fresh Fruits");
		System.out.println("Enter 6 to display tastes of all stale fruit in basket");
		System.out.println("Enter 7 to mark fruit in basket as stale");
		System.out.println("Enter 8 to mark all fruit as stale");
		System.out.println("Enter 9 to display all Stale Fruits");

		choice=sc.nextInt();
		return choice;
	}
	
}

