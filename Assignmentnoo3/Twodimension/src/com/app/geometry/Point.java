package com.app.geometry;

import java.util.Scanner;
import java.lang.Math;

public class Point 
{
	int xcor;
	int ycor;
	public Point() 
	{
	this(0,0);
		// TODO Auto-generated constructor stub
	}
	public Point(int xcor,int ycor)
	{
		this.xcor=xcor;
		this.ycor=ycor;
	}
	public void accept()
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter X cordinate");
		xcor=scanner.nextInt();
		System.out.println("Enter Y cordinate");
		ycor=scanner.nextInt();

		
	}
	public int getXcor() {
		return xcor;
	}
	public void setXcor(int xcor) {
		this.xcor = xcor;
	}
	public int getYcor() {
		return ycor;
	}
	public void setYcor(int ycor) {
		this.ycor = ycor;
	}
	public void display()
	{
		System.out.println("("+xcor+","+ycor+")");
		
	}
	public String getDetails()
	{
		String string1=String.valueOf(xcor);
		String string2=String.valueOf(ycor);
		return string1.concat(string2);

	}
	public Boolean isEqual(Point p1)
	{
		if(this.xcor==p1.getXcor()&&this.ycor==p1.getYcor())
			return true;
		else 
			return false;
			
	}
	public double calculateDistance(Point p1)
	{
		double temp,temp1;
	  //temp=	(Math.pow((p1.getXcor()-this.xcor),2))-(Math.pow((p1.getYcor()-this.ycor),2));
		temp1=(p1.getXcor()-this.xcor)*(p1.getXcor()-this.xcor);
		temp=(p1.getYcor()-this.ycor)*(p1.getYcor()-this.ycor);
		return (Math.sqrt(temp+temp1));
		
	
		
	}

}
