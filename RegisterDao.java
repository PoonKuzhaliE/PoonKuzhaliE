package ServletDEMO4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
private String dburl="jdbc://localhost:3306/DATABASE2";
private String dbname="root";
private String dbpassword="Password@1234";
private String dbdriver="com.mysql.jdbc.Driver";
public void loadDriver(String dbDriver) {
	try {
		Class.forName(dbDriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public Connection getConnection() {
	Connection con=null;
	try {
		con=DriverManager.getConnection(dburl,dbname,dbpassword);
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return null;
	
}
public String insert(Member member) {
	loadDriver(dbdriver);
	Connection con=getConnection();
	String result="data entered successfully";
	String sql="insert into DATABASE2.member values(?,?,?,?)";
	try {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, member.getUname());
		ps.setString(2, member.getPassword());
		ps.setString(3,member.getEmail());
		ps.setString(4,member.getPhone());
	}
	catch(SQLException e) {
		e.printStackTrace();
		result="data not entered";
	}
	return null;
	
}
}
