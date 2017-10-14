package partb;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/greet")
public class Greet extends HttpServlet
{
	private static final long serialVersionUID = 4426880007296241022L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name = req.getParameter("userName");
		String responseText = name == null || name.trim().compareTo("") == 0 ?
				"Who are you?" : String.format("Hello there, %s..", name.trim());
		res.getWriter().println(responseText);
	}
}
