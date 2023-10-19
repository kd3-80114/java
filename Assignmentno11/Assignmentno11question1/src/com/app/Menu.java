package com.app;
import java.io.InputStream;
import java.util.*;
public class Menu 
{
	int choice;
	Scanner scanner=new Scanner(System.in);
	public int displaymenu()
	{
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Reverse the list");
		System.out.println("0. To exit");
		choice=scanner.nextInt();

		return choice;
	}
	

}
