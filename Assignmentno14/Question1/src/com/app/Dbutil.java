package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil 
{
	public static final String DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/temp";
	public static final String USERNAME="kd3_80114_shrinitpatel";
	public static final String PASS="manager";
	static {
			try
			{
				Class.forName(DRIVER);
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
				
			}
		}
		
	
		public static Connection getConnection() throws SQLException
		{
			Connection con=DriverManager.getConnection(URL,USERNAME,PASS);
			return con;
		}
	

}
