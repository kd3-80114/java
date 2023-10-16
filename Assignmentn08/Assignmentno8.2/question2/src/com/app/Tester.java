package com.app;
import com.app.*;

class Temp
{
	public static void printDisplayableBox(Box<? extends Displayable> b)
	{
		b.getBox().displayData();
	}
	
	public static void printAnyBox(Box<?> b)
	{
		System.out.println(b.getBox().toString());
		}
}
public class Tester 

{
public static void main(String args[])
{

	Box<Person> b1=new Box<>();  
	b1.setBox(new Person());
	Temp.printDisplayableBox(b1);
	Box<Date> b2=new Box<>();
	b2.setBox(new Date());
	Temp.printDisplayableBox(b2);
	Box<String> b3=new Box<>();
	b3.setBox(new String("RO"));
	Temp.printAnyBox(b3);
}

}
