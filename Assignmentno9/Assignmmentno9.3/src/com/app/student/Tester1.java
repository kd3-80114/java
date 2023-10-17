package com.app.student;
import java.util.Arrays;

import com.app.student.*;
public class Tester1 
{
	public static void main(String args[])
	{
		Student students[]=new Student[5];
		students[0]=new Student("Shrinit","akola",90,8004);
		students[1]=new Student("Devesh","jalgon",40,8005);
		students[2]=new Student("Rohit","jalgoan",11,8012);
		students[3]=new Student("Narthak","nagpur",20,8014);
		students[4]=new Student("Ahrilekh","nagpur",20,8009);
		Studentcomparator s=new Studentcomparator();
		Arrays.sort(students,s);
		for(int i=0;i<5;i++)
		{
			System.out.println(students[i].toString());
		}
	}
}
