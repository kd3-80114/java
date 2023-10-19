package com.app;
import java.util.*;

public class Tester 
{
public static void main(String args[])
{
 
	Map<String,Library> books=new HashMap<>();
	Library l1=new Library();
	l1.acceptData();
	books.put(l1.getIsbn(),l1);
	Library l2=new Library();
	l2.acceptData();
	books.put(l2.getIsbn(), l2);
	
						
	


}
}

//Use TreeSet to store all books in descending order of price. Natural ordering for the Book should be isbn (do not change it). Display them using iterator()
//and descendingIterator().