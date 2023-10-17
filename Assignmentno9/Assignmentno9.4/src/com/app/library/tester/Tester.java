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
			Library l=new Library();
			l.setIsbn(isbn);
			if(books.contains(l))
				System.out.println("Book exists");
			else
				System.out.println("Book does not exist");	
		break;
		case 5:
			books.clear();
		break;
		case 6:
			System.out.println("No of books in Library"+books.size());
		break;
		case 7:
			class SortBookbyPrice implements Comparator<Library>
			{

				@Override
				public int compare(Library l1, Library l2) {
					return -Double.compare(l1.getPrice(),l2.getPrice());	
				}
				
			}
			SortBookbyPrice s=new SortBookbyPrice();
			books.sort(s);
			System.out.println("Library after sorting");
			for(Library ele:books)
			{
				System.out.println(ele.toString());	
			}
		break;
		}		
	}
	}

}
