package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

public class CandidateDAO implements AutoCloseable
{
    private Connection con;
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/temp";
	public static final String DB_USER = "kd3_80114_shrinitpatel";
	public static final String DB_PASSWD = "manager";
	public CandidateDAO() throws SQLException
	{
		con=Dbutil.getConnection();
	}
	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
	public int save(Candidate c)
	{ 
		int count=0;
		
			String sql="Insert into candidates values(?,?,?,?)";
			try(PreparedStatement stmt=con.prepareStatement(sql))
			{
				stmt.setInt(1,c.getId());
				stmt.setString(2,c.getName());
				stmt.setString(3,c.getParty());
				stmt.setInt(4,c.getVotes());
				count=stmt.executeUpdate();
				
			}
			
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	
	public int update(Candidate c)
	{
		int count=0;
		String sql="Update candidates set name=?,party=? where id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			stmt.setString(1,c.getName());
			stmt.setString(2,c.getParty());
			stmt.setInt(3,c.getId());
			count=stmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
		
	}
	public ArrayList<PartyWise> getPartyWiseVotes()
	{
		ArrayList<PartyWise> list=new ArrayList<>();
		String sql="SELECT party,sum(votes) as votes from candidates group by party";
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			try(ResultSet rs=stmt.executeQuery())
			{
				while(rs.next())
				{
					
					String party=rs.getString("party");
					int votes =rs.getInt("votes");
					PartyWise p=new PartyWise(votes,party);
					list.add(p);
				}
			}				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	return list;		
	}
}



