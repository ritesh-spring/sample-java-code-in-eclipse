package ritesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException 
		  {
		    // reading the user input
		    String color= request.getParameter("color");    
		    PrintWriter out = response.getWriter();
		    out.println (
		      "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\"http://www.w3.org/TR/html4/loose.dtd\">\n" +
		      "<html> \n" +
		        "<head> \n" +"<meta http-equiv=\"Content-Type\" content=\"text/html;charset=ISO-8859-1\"> \n" +
		          "<title> My first jsp  </title> \n" +
		        "</head> \n" +
		        "<body> \n" +
		          "<font size=\"12px\" color=\"" + color + "\">" +
		            "Ritesh Kumar" +
		          "</font> \n" +
		        "</body> \n" +
		      "</html>" 
		    );  
		  }  
}
