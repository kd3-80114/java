package com.sunbeaminfo.invoice.calc;

import java.util.Scanner;

public class Invoice
{
	int partNumber;
	String description;
	int quantity;
	double price;
	public Invoice()
	{
			this(5055,"Hammer",2,0.0);	
	}
	public Invoice(int partNumber,String description,int quantity,double price)
	{
		this.partNumber=partNumber;
		this.description=description;
		this.quantity=quantity;
		this.price=price;	
	}
	public int getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter part Number");
		partNumber=sc.nextInt();
		System.out.println("Enter Description");
		description=sc.next();
		System.out.println("Enter Quantity");
		quantity=sc.nextInt();
		if(quantity<0)
		{
			quantity=0;
		}
		System.out.println("Enter part Price");
		price=sc.nextDouble();
		if(price<0)
		{
			price=0.0;
		}
	}
	public void calculateInvoice()
	{
		System.out.println("Total amount for "+description+" with partnumber "+partNumber+" is "+quantity*price);	
	}
}
