package com.app;
import java.util.ArrayList;
import java.util.*;
public class Tester 
{
public static void main(String args[])
{
	
	Set<Library> books=new LinkedHashSet<>();
	

	Scanner sc=new Scanner(System.in);
books.add(new Library("11122",200,"abcd",2));
books.add(new Library("322",400,"ddcd",3));
books.add(new Library("444",800,"akjdfak",1));
books.add(new Library("adfjah",900,"akdjfh",8));
books.add(new Library("ueuqy984he",984,"iuywretu",9));
books.add(new Library("ueuqy984he",984,"iuywretu",9));
Iterator<Library> itr=books.iterator();
while(itr.hasNext())
{
	Library book=itr.next();
	System.out.println(book);
}	
}
}
//2. In above assignment use LinkedHashSet instead of HashSet. If any book with duplicate isbn is added, 
//what will happen? Books are stored in which order?
//Ans:-if books with duplicate isbn is added then it will skip that book.Books will be added in same order in which they are inserted.