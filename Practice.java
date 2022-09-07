package org.assign;

import java.sql.*;
import java.util.Scanner;



public class Practice 
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		System.out.println("enter the first name");
		Scanner sc=new Scanner(System.in);
		String firstname=sc.nextLine();
		System.out.println("enter the last name");
		String lastname=sc.nextLine();
	
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/DATABASE2";
			String uname="root";
			String pass="Password@1234";
			java.sql.Connection connect=DriverManager.getConnection(url,uname,pass);
			Statement st=connect.createStatement();
			st.executeUpdate("insert into user(first,last) values ('"+firstname+"','"+lastname+"')");
		System.out.println("good");
		System.out.println("enter the choice");
		String choice=sc.nextLine();
		
		if (choice.equals("yes")) 
		{
			st.executeUpdate("delete from user where first='kumar'");
			System.out.println("deleted");

		}
	
	}
}