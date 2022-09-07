import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDEMO2 extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	String a=req.getParameter("fname");
	String b=req.getParameter("lname");
	String c=a+b;
	PrintWriter obj=res.getWriter();
	obj.println(c);
}
}
