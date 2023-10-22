package com.app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester 
{
	public static void main (String args[]) throws SQLException
	{
		Scanner sc=new Scanner(System.in);

		int choice=1;
		while(choice!=0)
		{
			System.out.println("Enter 0 to exit");
			System.out.println("Enter 1 to inster new candidate");
			System.out.println("Enter 2 to update existing candidate");
			System.out.println("Enter 3 to get partywise total votes");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter name ");
				String name=sc.next();
				System.out.println("Enter party");
				String party=sc.next();
				System.out.println("Enter votes");
				int votes=sc.nextInt();
				Candidate candidate=new Candidate(id,name,party,votes);
				CandidateDAO mcandidatedao=new CandidateDAO();
				int count=mcandidatedao.save(candidate);
				System.out.println("Rows inserted "+count);
				break;
			case 2:
				System.out.println("Enter id to be updated");
				int id1=sc.nextInt();
				System.out.println("Enter name ");
				String name1=sc.next();
				System.out.println("Enter party");
				String party1=sc.next();
				Candidate candidatea=new Candidate(id1,name1,party1);
				CandidateDAO candidatedao=new CandidateDAO();
				int count1=candidatedao.update(candidatea);
				System.out.println("Rows updated "+count1);
				break;
			case 3:
				CandidateDAO candidatedao1=new CandidateDAO();
				ArrayList<PartyWise> list=candidatedao1.getPartyWiseVotes();
				for(PartyWise ele:list)
				{
					System.out.println(ele);
				}
				
			break;
			
				
			}
			
		}
			
	}

}
