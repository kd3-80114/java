package com.app.employees.tester;
import java.util.Scanner;

import com.app.employees.*;
public class Tester 
{
public static void main(String[] args) 
{
	int size,choice,index=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of employees");
	size=sc.nextInt();
	Employee employee[]=new Employee[size];
	Menu1 menu=new Menu1();
	while((choice=menu.chooseMenu())!=0)
	{
		switch(choice)
		{
		case 1:
			if(index>=0&&index<size)
			{
				employee[index]=new Salariesemployee();
				employee[index].acceptData();
				System.out.println("Weekly salaried employee accepted");
				index++;
			}
			else
			{
				System.out.println("Array is full can't Add more employees");
			}
		break;
		case 2:
			for(int i=0;i<index;i++)
			{
				if(employee[i].getType()=="weeklysalaried")
				{
					employee[i].calculateSalary();
				}
			}
			break;
		case 3:
			if(index>=0&&index<size)
			{
				employee[index]=new HourlySalaried();
				employee[index].acceptData();
				index++;
			}
			else
			{
				System.out.println("Array is full can't Add more employees");
			}
		break;
		case 4:
			for(int i=0;i<index;i++)
			{
				if(employee[i].getType()=="hourlySalaried")
				{
					employee[i].calculateSalary();
				}
			}
		break;
		
		
		case 5:
			if(index>=0&&index<size)
			{
				employee[index]=new CommisionEmployee();
				employee[index].acceptData();
				index++;
			}
			else
			{
				System.out.println("Array is full can't Add more employees");
			}
		break;
		case 6:
			for(int i=0;i<index;i++)
			{
				if(employee[i].getType()=="commisioned")
				{
					employee[i].calculateSalary();
				}
			}
		break;
		
		case 7:
			if(index>=0&&index<size)
			{
				employee[index]=new Basepluscommissionemployee();
				employee[index].acceptData();
				index++;
			}
			else
			{
				System.out.println("Array is full can't Add more employees");
			}
		break;
		case 8:
			for(int i=0;i<index;i++)
			{
				if(employee[i].getType()=="basepluscommision")
				{
					employee[i].calculateSalary();
				}
			}
		break;			
		}
	}

}
}
