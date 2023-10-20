package com.app;

import java.util.Scanner;

interface Aritheatic<T>{
	public double calc(Double a,Double b);
}

public class Arithe 
{
	static double calculate(double a,double b,Aritheatic<Double> doub)
	{
		 return doub.calc(a,b);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice=1;
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		while(choice!=0)
		{

			System.out.println("Enter 0 to exit");
			System.out.println("Enter 1 to Add");
			System.out.println("Enter 2 to Substract");
			System.out.println("Enter 3 to Multiply");
			System.out.println("Enter 4 to Division");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				double result=calculate(num1,num2,new Aritheatic<Double>() {
					@Override
					public double calc(Double a, Double b) {
												return a+b;
					}
				});
				System.out.println("Addition ="+result);
			break;
			case 2:
				result=calculate(num1,num2,new Aritheatic<Double>() {
					public double calc(Double a,Double b)
					{
						return a-b;
					}
					
				});
				System.out.println("Substraction ="+result);
			break;
			case 3:
				result=calculate(num1,num2,new Aritheatic<Double>() {
					public double calc(Double a,Double b)
					{
						return a*b;
					}
				});
				System.out.println("Multiplication ="+result);
			break;
			case 4:
				result=calculate(num1,num2,new Aritheatic<Double>()
				{
					public double calc(Double a,Double b)
					{
						return a/b;
					}
				});
				System.out.println("Division = "+result);
				
			
			}
		}
		
		
	}

}
//Create a functional interface Arithmetic with single abstract method double calc(double,double). 
//Write a static method calculate() in main class as follows. 
//In main(), write a menu driven program that inputs two numbers from the user and calls calculate() method with appropriate lambda
//expression (in arg3) to perform addition, subtraction, multiplication and division operations
