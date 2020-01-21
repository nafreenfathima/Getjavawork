import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Success
 */
@WebServlet(description = "Displays a messages", urlPatterns = { "/Success" })
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()   
     */
    public Success() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		java.util.Date currDate=new java.util.Date();
		java.io.PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>Greeting Servlet</title></head>");
		out.println("<body>Hello " + currDate + "</body></html>");
           response.getWriter().append("Served at: ").append(request.getContextPath());

				}

}
