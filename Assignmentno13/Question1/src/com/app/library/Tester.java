package com.app.library;
import java.util.ArrayList;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
public class Tester 
{
	public static void write(ArrayList<Library> books)
	{
		try(FileOutputStream fout=new FileOutputStream("Library.bin"))
		{
			try(DataOutputStream dout=new DataOutputStream(fout))
			{
				for(int i=0;i<books.size();i++)
				{
					
					dout.writeUTF((books.get(i).getAuthorName()));
					dout.writeUTF((books.get(i).getIsbn()));
					dout.writeDouble((books.get(i).getPrice()));
					dout.writeInt((books.get(i).getQuantity()));				}
			}
		}
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Loaded");
		
	}
	
	public static ArrayList<Library> read()
	{
		ArrayList<Library> books=new ArrayList<>();
		
		try(FileInputStream fin=new FileInputStream("Library.bin"))
		{
			try(DataInputStream din=new DataInputStream(fin))
			{
				while(true)
				{					
					Library l=new Library();
					l.setAuthorName(din.readUTF());
					l.setIsbn(din.readUTF());
					l.setPrice(din.readDouble());
					l.setQuantity(din.readInt());
					books.add(l);	
				}
			}
			
		}
		
		catch(EOFException e1)
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		return books;
	}
public static void main(String args[])     																
																				
{
	int choice;
	String isbn;
	int index;

	Scanner sc=new Scanner(System.in);
	ArrayList<Library> books=read(); 


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
		break;
		}
	}

	write(books);
	System.out.println("All books are saved");
}

}

