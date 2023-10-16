package com.app;
import java.util.*;
public class Person implements Displayable {
	private String name;
	private int age;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter name");
		this.name=sc.next();
		System.out.println("Enter age");
		this.age=sc.nextInt();
	}
	public void displayData()
	{
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}
	

}
