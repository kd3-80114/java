package com.app;
import java.util.*;

public class Date implements Displayable{
	int day,month,year;
	public Date() {
		this(1,1,1);
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void accept()
	{
		int temp;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Day");
		temp=scanner.nextInt();
		if(temp>0&&temp<=31)
		{
			day=temp;
			temp=0;
		}
		System.out.println("Enter month");
		temp=scanner.nextInt();
		if(temp>0&&temp<=12)
		{
			month=temp;
			temp=0;
		}
		System.out.println("Enter Year");
		temp=scanner.nextInt();
		if(temp>0&&temp<=2023)
		{
			year=temp;
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayData()
	{
		System.out.println(day+"/"+month+"/"+year);
	}

}
