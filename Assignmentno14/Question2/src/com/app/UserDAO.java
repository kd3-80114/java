package com.app;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class UserDAO implements AutoCloseable
{
	private static Connection con;
	public UserDAO()
	{
		try {
			con=Dbutil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int insert(User u)
	{int count=0;
		String sql="insert into users values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			stmt.setInt(1,u.getId());
			stmt.setString(2,u.getFirst_name());
			stmt.setString(3,u.getList_name());
			stmt.setString(4,u.getEmail());
			stmt.setString(5,u.getPassword());
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date date = sdf.parse(u.getDob());
			java.sql.Date sDate = new java.sql.Date( date.getTime() );
			stmt.setDate(6,sDate);
			stmt.setBoolean(7,u.isStatus());
			stmt.setString(8,u.getRole());
			count=stmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	public int update(User u)
	{
		int count=0;
		String sql="update users set first_name=?,last_name=?,password=? where id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			
			stmt.setString(1, u.getFirst_name());
			stmt.setString(2, u.getList_name());
			stmt.setString(3,u.getPassword());
			stmt.setInt(4, u.getId());
			count=stmt.executeUpdate();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return count;	
	}
	public int delete(User u)
	{
		int count=0;
		String sql="DELETE FROM users where id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			stmt.setInt(1,u.getId());
			count=stmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	public void select()
	{
		String s="SELECT * FROM users";
		try(PreparedStatement stmt=con.prepareStatement(s))
		{
			try(ResultSet rs=stmt.executeQuery())
			{
			while(rs.next())
			{
				int id=rs.getInt("id");
				String firstname=rs.getString("first_name");
				String lastname=rs.getString("last_name");
				String email=rs.getString("email");
				String role=rs.getString("role");
				String status=rs.getString("status");
				Date dob=rs.getDate("dob");
				
				java.util.Date udate=new java.sql.Date(dob.getTime());
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				String date=sdf.format(udate);
				System.out.println(firstname+" "+lastname+" "+email+" "+role+" "+status+" "+date);
				
				
				
			}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void close() throws Exception {
		if(con!=null)
			con.close();
		
	}
	

}
