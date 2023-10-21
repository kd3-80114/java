package com.app;

import java.util.Scanner;

public class Students 
{
 private int rollno;
 private String name;
 Scanner sc=new Scanner(System.in);
 public Students(int rollno,String name)
 {
	 this.rollno=rollno;
	 this.name=name;
 }
 public Students()
 {
	 this(0,"");
 }
 public void acceptData()
 {
	 System.out.println("Enter rollno");
	 this.rollno=sc.nextInt();
	 System.out.println("Enter name");
	 this.name=sc.next();
 }
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Scanner getSc() {
	return sc;
}
public void setSc(Scanner sc) {
	this.sc = sc;
}
public String toString()
{
	return "Name = "+name+" Rollno = "+rollno;
}
}
