package com.app.geometry;
import java.util.*;
public class Menu {
	private int choice;
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	Scanner s=new Scanner(System.in);
	public int  displaymenu() 
	{
		System.out.println("Enter choice");
		System.out.println("Enter 1 to Display details of specific Point ");
		System.out.println("Enter 2 to Display x,y cordinate of all points");
		System.out.println("Enter 3 to input two points to validate indices");
		System.out.println("Enter 0 to exit");
		choice=s.nextInt();
		return choice;
	}
	

}
