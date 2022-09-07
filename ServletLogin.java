package Servletlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLogin extends HttpServlet{
public void dopost(HttpServletRequest req,HttpServletResponse res) throws IOException {
	PrintWriter obj=res.getWriter();
	res.setContentType("text/html");
	
	String a=req.getParameter("username");
	String b=req.getParameter("password");
	
obj.println("Succesfully login");
}
}