package com.app.library;
import java.util.ArrayList;
import java.util.*;
public class Tester 
{
public static void main(String args[])
{
	int choice;
	String isbn;
	ArrayList<Library> books=new ArrayList<>();
	int index;

	Scanner sc=new Scanner(System.in);
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
			Library library1;
			library.acceptData();
			if(books.contains(library))
			{
				index=books.indexOf(library);
				library1=books.get(index);
				library1.setQuantity(library1.getQuantity()+library.getQuantity());
				System.out.println("Books already exists so incrementing by quantity");
			}
			else
			{
				books.add(library);	
			}
		break;
		case 2:
			for(int i=0;i<books.size();i++)
			{
				System.out.println(books.get(i));;
			}
		break;
		case 3:
			System.out.println("Enter ISBN");
			isbn=sc.next();
			Library lib=new Library();
			lib.setIsbn(isbn);
			if(books.contains(lib))
			{
				System.out.println(books.get(books.indexOf(lib)));
			}
		case 4:
			System.out.println("Enter Index of book to delete");
			index=sc.nextInt();
			books.remove(index);
		break;
		case 5:
			System.out.println("Enter ISBN of the book to delete");
			
			isbn=sc.next();
			Library key=new Library();
			key.setIsbn(isbn);
			if(books.contains(key))
			{
				index=books.indexOf(key);
				books.remove(index);
			}
		break;
		case 6:
			Collections.reverse(books);
			
			
			
			
		}
	}
	
}
}
