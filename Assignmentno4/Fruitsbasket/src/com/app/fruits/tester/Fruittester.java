package com.app.fruits.tester;
import com.app.fruits.*;
import java.util.*;
public class Fruittester 
{
	public static void main(String[] args) 
	{
		int choice,size,index=0,index1=0;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter No of fruits in Fruit");
		size=scanner.nextInt();
		Fruits fruit[]=new Fruits[size];
		Menu menu=new Menu();
		while((choice=menu.chooseMenu())!=0)
		{
			switch(choice)
			{
			case 1:
				if(index<size&&index>=0)
				{
					fruit[index]=new Mango();
					fruit[index].acceptData();
					
					index++;
				}
				else
				{
					System.out.println("Can't add Mango because Basket is already full..");
				}
				break;
			case 2:
				if(index<size&&index>=0)
				{
					fruit[index]=new Orange();
					fruit[index].acceptData();
					
					index++;
				}
				else
				{
					System.out.println("Can't add Orange because Basket is already full..");
				}
				break;
			case 3:
				if(index<size&&index>=0)
				{
					fruit[index]=new Apple();
					fruit[index].acceptData();
					
					index++;
				}
				else
				{
					System.out.println("Can't add Apple because Basket is already full..");
				}
				break;
			case 4:
				for(int i=0;i<index;i++)
				{
					System.out.println(fruit[i].getName());
				}
				break;
			case 5:
				for(int i=0;i<index;i++)
				{
					if(fruit[i].isFresh()==true)
					{
						fruit[i].displayData();	
					}
				}
				break;
			case 6:
				for(int i=0;i<index;i++)
				{
					if(fruit[i].isFresh()!=true)
					{
						System.out.println(fruit[i].taste());
					}
				}
				break;
			case 7:
				System.out.println("Enter index of the fruit to mark as stale");
				index1=scanner.nextInt();
				if(index1>0&&index1<=index)
				{
					index1=index1-1;
					fruit[index1].setFresh(false);
					fruit[index1].displayData();
				}
				else
				{
					System.out.println("invalid index");
				}
				break;
			case 8:
				for(int i=0;i<index;i++)
				{
					if(fruit[i].taste()=="Sour")
					{
						fruit[i].setFresh(false);
					}
				}
			case 9:
				for(int i=0;i<index;i++)
				{
					if(fruit[i].isFresh()==false)
					{
						fruit[i].displayData();	
					}
				}
				break;
				default:
					System.out.println("Wrong choice entered");
				
			}
		}
		
		
		System.out.println("Thank you...");
	}
}
