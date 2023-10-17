package com.app.library;
import java.io.InputStream;
import java.util.*;
public class Menu 
{
	int choice;
	Scanner scanner=new Scanner(System.in);
	public int displaymenu()
	{
		System.out.println("Enter 1. Add new book in list.");
		System.out.println("Enter 2. Display all books in forward order. ");
		System.out.println("Enter 3. Delete at book given index");
		System.out.println("Enter 4. Check if book with given isbn is in list or not");
		System.out.println("Enter 5.  Delete all books in list");
		System.out.println("Enter 6. Display number of books in list");
		System.out.println("Enter 7. Sort all books by price in desc order");
		choice=scanner.nextInt();

		return choice;
	}
	

}
