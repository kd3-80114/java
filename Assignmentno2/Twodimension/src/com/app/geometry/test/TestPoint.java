package com.app.geometry.test;

import java.util.Scanner;

import com.app.geometry.Point;

public class TestPoint {


	public static void main(String[] args) {
		int xcor1,ycor1,xcor2,ycor2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter x cordinate for Point 1");
		xcor1=scanner.nextInt();
		System.out.println("Enter y cordinate for Point 1");
		ycor1=scanner.nextInt();
		Point poi=new Point(xcor1,ycor1);
		System.out.println("Enter x cordinate for Point 2");
		xcor2=scanner.nextInt();
		System.out.println("Enter y cordinate for Point 2");
		ycor2=scanner.nextInt();
		Point poi1=new Point(xcor2,ycor2);
		poi.display();
		poi1.display();
		if(poi1.isEqual(poi))
		poi.display();
		else {
			System.out.println("Distance = "+poi.calculateDistance(poi1));
		}
	}

}
