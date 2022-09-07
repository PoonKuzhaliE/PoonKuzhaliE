import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDEMO7 extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) {
	String arrival=req.getParameter("from");
	String destination=req.getParameter("to");
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/DATABASE2";
	String uname="root";
	String pass="Password@1234";
	java.sql.Connection connect=DriverManager.getConnection(url,uname,pass);
	Statement st=connect.createStatement();
	st.executeUpdate("insert into user(first,last) values ('"+from+"','"+to+"')");
}
}
