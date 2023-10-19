package com.app;
import java.util.ArrayList;
import java.util.*;

public class Tester 
{
public static void main(String args[])
{
	class BookDecendComparator implements Comparator<Library>
	{

		@Override
		public int compare(Library l1, Library l2) {
			int diff=-Double.compare(l1.getPrice(), l2.getPrice());
			return diff;
		}
		
	}
	BookDecendComparator n=new BookDecendComparator(); 
	Set<Library> books=new TreeSet<>(n);
	

	Scanner sc=new Scanner(System.in);
books.add(new Library("B",200,"abcd",2));
books.add(new Library("F",400,"ddcd",3));
books.add(new Library("Z",800,"akjdfak",1));
books.add(new Library("T",900,"akdjfh",8));
books.add(new Library("P",984,"iuywretu",9));
books.add(new Library("P",984,"goto",99));
Iterator<Library> itr=books.iterator();
while(itr.hasNext())
{
	Library book=itr.next();
	System.out.println(book);
}

}
}

//Use TreeSet to store all books in descending order of price. Natural ordering for the Book should be isbn (do not change it). Display them using iterator()
//and descendingIterator().