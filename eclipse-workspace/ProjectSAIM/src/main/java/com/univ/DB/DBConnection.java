package com.univ.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection implements DBConfig {
	public static Connection getConn() {
		Connection con = null;
		try 
		{
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,UNM,PW);
			
			
			
		}catch(Exception e) {System.out.println(e);}
		
		return con;
		
	}
	

}
