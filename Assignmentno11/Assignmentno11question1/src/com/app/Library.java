package com.app;

import java.util.*;
public class Library 
{

	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	Scanner sc=new Scanner(System.in);
	public Library()
	{
		
	}
	public Library(String isbn,double price,String authorName,int quantity)
	{
		this.isbn=isbn;
		this.price=price;
		this.authorName=authorName;
		this.quantity=quantity;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
     public void acceptData()
     {
    	 System.out.println("Enter ISBN");
    	 this.isbn=sc.next();
    	 System.out.println("Enter price");
    	 this.price=sc.nextDouble();
    	 System.out.println("Enter Authorname");
    	 this.authorName=sc.next();
    	 System.out.println("Enter quantity");
    	 this.quantity=sc.nextInt();
}
	@Override
	public String toString() {
		return "ISBN ="+isbn+", Price = "+price+", AuthorName = "+authorName+", Quantity = "+quantity;
	}
	@Override
	public int hashCode()
	{
		int hash=Objects.hash(this.isbn);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Library)
		{
			Library other=(Library)obj;
			if(this.isbn==other.isbn)
			{
				return true;
			}
		}
		return false;
		
	}
	
	
}
