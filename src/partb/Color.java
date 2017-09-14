package partb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/color")
public class Color extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String selectedColor = req.getParameter("colorSelector");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html><head><title>Custom Background</title>");
		out.println(String.format("<style> body {background: %s; %s } </style></head><body><h1>Chosen Background: %s</h1></body></html>", selectedColor, (selectedColor.equals("#000000") ? "color: white;": ""), selectedColor));
	}
}
