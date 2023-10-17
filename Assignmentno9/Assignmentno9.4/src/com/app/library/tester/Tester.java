package com.app.library.tester;
import com.app.library.*;
import java.util.*;
import java.util.ArrayList;
public class Tester 
{
	public static void main(String args[])
	{
		int choice;
		Scanner sc=new Scanner(System.in);
	ArrayList<Library> books=new ArrayList<Library>();
	books.add(new Library("11122",200,"abcd",2));
	books.add(new Library("322",400,"ddcd",3));
	books.add(new Library("444",800,"akjdfak",1));
	books.add(new Library("adfjah",900,"akdjfh",8));
	books.add(new Library("ueuqy984he",984,"iuywretu",9));
	Menu menu=new Menu();
	while((choice=menu.displaymenu())!=0)
	{
		switch(choice)
		{
		case 1:
			Library library=new Library();
			library.acceptData();
			books.add(library);
		break;
		case 2:
			for(Library elem:books)
			{
				System.out.println(elem.toString());;
			}
		break;
		case 3:
			System.out.println("Enter index to delete book at ");
			int index=sc.nextInt();
			books.remove(index);
		break;
		case 4:
			System.out.println("Eneter ISBN to search for");
			String isbn=sc.next();
		}
	}
		
	
	}

}
//String isbn,double price,String authorName,int quantity
//4. Store book details in a library in a list -- ArrayList.
//Book details: isbn(string), price(double), authorName(string), quantity(int)
//Write a menu driven (do-while + switch-case) program to
//1. Add new book in list.
//2. Display all books in forward order.
//3. Delete at book given index -- list.remove(index);
//4. Check if book with given isbn is in list or not
//5. Delete all books in list
//6. Display number of books in list
//7. Sort all books by price in desc order -- list.sort();
