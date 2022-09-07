import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class ServletDEMO3 extends HttpServlet {
public void dopost(HttpServletRequest req,HttpServletResponse res) throws IOException {
	res.setContentType("text/html");
	String i=req.getParameter("fname");
	String j=req.getParameter("lname");
//	String age=req.getParameter("age");
	String gen=req.getParameter("gender");
	String em=req.getParameter("email");
	String ad=req.getParameter("address");
	PrintWriter out=res.getWriter();
//	try {
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=DriverManager.getConnection()
//	}
	out .println(i);
	out.println(j);
	//out.println(age);
//	out.println(gen);
//	out.println(em);
//	out.println(ad);
}
}
