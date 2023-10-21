package com.app;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Tester 
{
public static void main(String[] args) 

{
	Scanner sc=new Scanner(System.in);
	Map<Integer,Students> map=new LinkedHashMap<>();
	map.put(1,new Students(1,"abcqertyd"));
	map.put(3,new Students(3,"abklhcd"));
	map.put(5,new Students(5,"aettybcd"));
	map.put(9,new Students(9,"absfgcd"));
	map.put(2,new Students(2,"ajkbcd"));
	map.put(2,new Students(2,"Sgj"));

	
	int choice=1;
	while(choice!=0)
	{
		System.out.println("Enter 0 to exit");
		System.out.println("Enter 1 to add new Student");
		System.out.println("Enter 2 to find students by their rollno");
		System.out.println("Enter 3 to Display all students ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Students s=new Students();
			s.acceptData();
			map.put(s.getRollno(),s);
			break;
		case 2:
			System.out.println("Enter roll Number");
			int rollno=sc.nextInt();
			System.out.println(map.get(rollno));
			break;
		case 3:
			Set<Entry<Integer,Students>> entries = map.entrySet();
		    for(Entry<Integer,Students> entry : entries) 
		    {
		    	System.out.println(entry.getKey() + " -- " + entry.getValue());
		    }
		    break;
		}
		
	}
}
}


//Store Students in LinkedHashMap<> so that, for given roll, 
//Student can be searched in fastest possible time. Do we need to write equals() and
//hashCode() in Student class? Follow menu-driven approach. Hint: