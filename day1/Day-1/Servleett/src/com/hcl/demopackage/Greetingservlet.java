package com.hcl.demopackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Greetingservlet
 */
@WebServlet(
		description = "Greets the visitors", 
		urlPatterns = { "/Greeting" }, 
		initParams = { 
				@WebInitParam(name = "greeting", value = "goodmorning", description = "morning greetings")
		})
public class Greetingservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Greetingservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

    java.util.Date currDate=new java.util.Date();
     java.io.PrintWriter out=response.getWriter();
      response.setContentType("text/html");
     out.println("<html><head><title>Greeting Servlet</title></head>");
      		out.println("<body>Hello " + currDate + "</body></html>");
      		response.getWriter().append("Served at:").append(request.getContextPath());
	}

}
