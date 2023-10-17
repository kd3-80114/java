package com.app.geometry.test;
import com.app.geometry.*;
import java.util.Scanner;

public class Testpointarray1 {
	public static void main(String[] args) {
		int noofPoints,choice,index,startpoint,endpoint;
		//Point point=new Point();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No of Points");
		noofPoints=scanner.nextInt();
		Point point[]=new Point[noofPoints];
		for(int i=0;i<noofPoints;i++)
		{
			point[i]=new Point();
		}
		for(int i=0;i<noofPoints;i++)
		{
			System.out.println("Enter cordinates for point "+(i+1));
			point[i].accept();
			
		}
		Menu menu=new Menu();
		while((choice=menu.displaymenu())!=0)
		{
			switch(choice)
			{
			case 1:
				System.out.println("Enter index of specific point to display");
				index=scanner.nextInt();
				for(int i=0;i<point.length;i++)
				{
					if(i==index-1)
					{
						point[i].display();
					}
					else if(index<0||index>point.length)
					{
						System.out.println("Array index out of bound");
						break;
					}
					
				}
				break;
			case 2:
				for(Point p:point)
				{
					p.display();
				}
				break;
			case 3:
				System.out.println("Enter the index of Start point");
				startpoint=scanner.nextInt();
				System.out.println("Enter the index of End point");
				endpoint=scanner.nextInt();
				//System.out.println("Distance between specified points"+point[startpoint].calculateDistance(point[endpoint]));
				if(point[startpoint-1].isEqual(point[endpoint-1]))
				{
					point[startpoint-1].display();
				}
				else 
				{
				//System.out.println("Distance between point "+point[startpoint].display()+"Loacated at index"+(startpoint+1)+" and point "+point[endpoint].display()+" located at index "+(endpoint+1));;	
					System.out.print("Points are not equal hence distance between them is ");
					System.out.println(point[startpoint-1].calculateDistance(point[endpoint-1]));
				}
				break;
				
			}
			
		}
		
		}
	

}
