package com.app;

import java.util.Scanner;

public class Candidate {
	private int id;
	private String name;
	private String party;
	private int votes;
	
	public Candidate()
	{
		
	}

	public Candidate(int id, String name, String party,int votes) {
		
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes=votes;
	}
public Candidate(int id, String name, String party) {
		
		this.id = id;
		this.name = name;
		this.party = party;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getVotes() {
		return votes;
	}
	public void accept()
	{
		Scanner sc=new Scanner (System.in); 
		System.out.println("Enter name");
		this.name=sc.next();
		System.out.println("Enter party");
		this.party=sc.next();
		System.out.println("Enter id");
		this.id=sc.nextInt();
		System.out.println("Enter votes");
		this.votes=sc.nextInt();
		
		
		
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", party=" + party + "]";
	}
	
	

}
