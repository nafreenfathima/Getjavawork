package javapoint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServ
 */
@WebServlet(description = "accepts name", urlPatterns = { "/DemoServ" })
public class DemoServ extends HttpServlet{ 
	String url;
	public void init(ServletConfig config)throws ServletException
	{
		 url=getServletContext().getInitParameter("url");
	}
	
	
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter pw=res.getWriter();  
  
String name=req.getParameter("name");//will return value  
pw.println("Welcome "+name);  
  
pw.close();  
}
}  
