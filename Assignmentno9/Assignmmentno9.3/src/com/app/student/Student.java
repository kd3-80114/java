package com.app.student;
import java.util.*;
public class Student
{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	private String name;
	private String city;
	private int marks;
	private int rollNo;
	Scanner sc=new Scanner(System.in);
	public Student()
	{
		this(" "," ",0,0);
	}
	public Student(String name, String city, int marks, int rollNo) {

		this.name = name;
		this.city = city;
		this.marks = marks;
		this.rollNo = rollNo;
	}
	public void acceptData()
	{
		System.out.println("Enter name");
		this.name=sc.next();
		System.out.println("Enter roll Number");
		this.rollNo=sc.nextInt();
		System.out.println("Enter city");
		this.city=sc.next();
		System.out.println("Enter marks");
		this.marks=sc.nextInt();	
	}
	@Override
	public String toString() {
		return ("name=" + name + ", city=" + city + ", marks=" + marks + ", rollNo=" + rollNo);
	}
	

}
