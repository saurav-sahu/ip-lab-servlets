package partb;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Hour;

@WebServlet(urlPatterns="/11")
public class GreetUser extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String message = "";
		int hour = Hour.getHour();
		
		if (hour >= 6 && hour < 12)
            message = "Good morning!";
        else if (hour < 16)
        	message = "Good afternoon!";
        else if (hour < 21)
        	message = "Good evening!";
        else message = "Good night!";

		res.getWriter().println("<h1>" + message + "</h1>");
	}
}
