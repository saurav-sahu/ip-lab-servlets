package partb;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/greet")
public class Greet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name = req.getParameter("userName").trim();
		String responseText = name.compareTo("") == 0 ?
				"Who are you?" : String.format("Hello there, %s..", name);
		res.getWriter().println(responseText);
	}
}
