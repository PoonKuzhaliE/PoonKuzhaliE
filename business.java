package com.business;

import java.sql.*;


import com.applicationdemo.DBConnection;

public class business {
	public static ResultSet Stationlist() {
		Connection connection;
		connection = DBConnection.SQLConnection();
		ResultSet resultset = null;
		String SQLquery = "select StationName from StationList";
		try {
			Statement statement = connection.createStatement();
			resultset = statement.executeQuery(SQLquery);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}


		return resultset;
	}

	public static ResultSet emailcheck(String email) {
		Connection connection = DBConnection.SQLConnection();
		ResultSet resultset = null;
	
		try {
			PreparedStatement pstmt = null;
			pstmt = connection.prepareStatement("SELECT * FROM user WHERE email=?");
			pstmt.setString(1, email);
			resultset = pstmt.executeQuery();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}


		return resultset;
	}
	public static ResultSet phonenumbercheck(String phonenum) {
		Connection connection = DBConnection.SQLConnection();
		ResultSet resultset = null;
	
		try {
			PreparedStatement pstmt = null;
			pstmt = connection.prepareStatement("SELECT * FROM user WHERE phno=?");
			pstmt.setString(1, phonenum);
			resultset = pstmt.executeQuery();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}


		return resultset;
	}
	public static ResultSet useridcheck(String userid) {
		Connection connection = DBConnection.SQLConnection();
		ResultSet resultset = null;
	
		try {
			PreparedStatement pstmt = null;
			pstmt = connection.prepareStatement("SELECT * FROM user WHERE userid=?");
			pstmt.setString(1, userid);
			resultset = pstmt.executeQuery();
		} catch (Exception e) 
		{
			e.printStackTrace();
			
		}


		return resultset;
	}
	public static String SignUp(String name,String userid,String email,String phone,String password) 
	{
		Connection connection = DBConnection.SQLConnection();
	System.out.println(password);
	
		try {
			Statement pstmt = connection.createStatement();
	        pstmt.executeUpdate("insert into user(name,userid,email,phno,password)values('"+name+"','"+userid+"','"+email+"','"+phone+"','"+password+"')");
	      
		} catch (Exception e) 
		{
			e.printStackTrace();
			return "failure";
		}


		return "success";
	}
	
	
	




}
