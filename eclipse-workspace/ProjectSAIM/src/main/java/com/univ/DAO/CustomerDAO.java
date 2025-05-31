package com.univ.DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.univ.DB.DBConnection;
import com.univ.DTO.CustomerDTO;

public class CustomerDAO {
	public int Insert(CustomerDTO dto) {
		int x = 0;
		
		try {
			Connection con1= DBConnection.getConn();
			PreparedStatement ps = con1.prepareStatement
					("insert into customer(cname,cadd,email,mob,unm,pw) values(?,?,?,?,?,?)");
			ps.setString(1,dto.getCname());
			ps.setString(2,dto.getCadd());
			ps.setString(3,dto.getEmail());
			ps.setLong(4,dto.getMob());
			ps.setString(5,dto.getUnm());
			ps.setString(6,dto.getPw());
			x =ps.executeUpdate();
			
			
	
	
			}
			catch(Exception e) {System.out.println(e);}
		return x;
	} //insert method end
	
	public List loginCheck(String unm, String pw) {
	List lst = new ArrayList();
	
	try {
		Connection con2 = DBConnection.getConn();
	PreparedStatement ps=	con2.prepareStatement
		("select * from customer where unm=? AND pw=?");
	ps.setString(1,unm);
	ps.setString(2,pw);
	ResultSet rs = ps.executeQuery();
	if(rs.next())
	{
		lst.add(rs.getInt(1));
		lst.add(rs.getString(2));
		lst.add(rs.getString(3));
		lst.add(rs.getString(4));
		lst.add(rs.getLong(5));
		lst.add(rs.getString(6));
		lst.add(rs.getString(7));
		

	}
		
		
		
		
	}catch(Exception e) 
	{System.out.println(e);}
	
	return lst; 
	
	
	}
	}


