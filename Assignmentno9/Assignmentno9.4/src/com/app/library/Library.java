package com.app.library;
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Library))
			return false;
		Library other = (Library) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
}
