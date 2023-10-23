package com.app;

import java.util.Scanner;

public class UserMain 
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice=1;
		while(choice!=0)
		{
			System.out.println("Enter 0 to exit");
			System.out.println("Enter 1 to Insert Candidate");
			System.out.println("Enter 2 for Update Candidate");
			System.out.println("Enter 3 to delete Candidate ");
			System.out.println("Enter 4 to Display all Candidate");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				int count=0;
				User u=new User("sarthak","nagdeote","sarthak@gmail.com","null",false,"admin","12-12-2022",9);
				try(UserDAO uw=new UserDAO())
				{
					count=uw.insert(u);
					System.out.println(count+"Rows inserted");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			break;
			case 2:
				System.out.println("Enter id to be updated");
				int id=sc.nextInt();
				System.out.println("Enter first name ");
				String fname1=sc.next();
				System.out.println("Enter lastname");
				String lname=sc.next();
				User u1=new User(fname1,lname,id);
				UserDAO uw=new UserDAO();
				count=uw.update(u1);
				System.out.println(count+"Rows inserted");
			break;
			case 3:
				System.out.println("Enter id to be deleted");
				int id1=sc.nextInt();
				User urs=new User(null, null, null, null, false, null, null, id1);
				UserDAO ut=new UserDAO();
				ut.delete(urs);
				count=ut.delete(urs);
				System.out.println(count+" Rows deleted");
			break;
			case 4:
				UserDAO ut1=new UserDAO();
				ut1.select();
			break;	
			}
			
		}
	}
}
