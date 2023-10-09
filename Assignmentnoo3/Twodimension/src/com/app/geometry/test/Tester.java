package com.app.geometry.test;

import com.app.geometry.Point;

public class Tester 
{
	public static void main(String args[])
	{
		String string;
		Point p1=new Point();
		p1.accept();
		//p1.display();
		string=p1.getDetails();
		Point p2=new Point();
		p2.accept();
		//p2.display();
		System.out.println(p1.calculateDistance(p2));
	}

}
