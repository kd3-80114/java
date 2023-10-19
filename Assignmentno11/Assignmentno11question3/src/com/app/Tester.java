package com.app;
import java.util.ArrayList;
import java.util.*;
public class Tester 
{
public static void main(String args[])
{
	
	Set<Library> books=new TreeSet<>();
	

	Scanner sc=new Scanner(System.in);
books.add(new Library("B",200,"abcd",2));
books.add(new Library("F",400,"ddcd",3));
books.add(new Library("Z",800,"akjdfak",1));
books.add(new Library("T",900,"akdjfh",8));
books.add(new Library("P",984,"iuywretu",9));
books.add(new Library("P",9,"goto",99));
Iterator<Library> itr=books.iterator();
while(itr.hasNext())
{
	Library book=itr.next();
	System.out.println(book);
}	
}
}
//If any book with duplicate isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.
//Duplicate values cannnot be added in hashset if isequals and hashcode is implemented .the books will be stored in random orderd.



//Duplicate books will not be added.Books will be stored in sorted order.