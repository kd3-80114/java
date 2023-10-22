package com.app;

public class PartyWise {
	private int votes;
	private String party;
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	@Override
	public String toString() {
		return "PartyWise [votes=" + votes + ", party=" + party + "]";
	}
	public PartyWise(int votes, String party) {
		this.votes = votes;
		this.party = party;
	}
	public PartyWise()
	{
		
	}
	

}
