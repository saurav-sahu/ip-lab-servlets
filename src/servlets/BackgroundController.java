package servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/background")
public class BackgroundController extends HttpServlet{
	
	private static final long serialVersionUID = 3337153763195542784L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String format = "<html><head><title>Choose a Background Color</title><style>body { background-color: %s }</style></head><body><h1>Background Color Chosen</h1><h2>%s</h2></body></html>";
		String bg = req.getParameter("background");
		
		if (bg == null) bg = "white";
		res.getWriter().println(String.format(format, bg, bg));
	}
}

