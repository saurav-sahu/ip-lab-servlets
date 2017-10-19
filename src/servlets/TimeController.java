package servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlets.util.TimeHelper;

import java.util.Calendar;
import java.text.SimpleDateFormat;

@WebServlet(urlPatterns = "/time")
public class TimeController extends HttpServlet {
	String format = "<html><head><title>Greeting based on Time</title></head><body><h1>%s</h1></body></html>";
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int hour = Integer.parseInt(new SimpleDateFormat("HH").format(Calendar.getInstance().getTime()));
		res.getWriter().println(String.format(format, TimeHelper.getMessageBasedOnHour(hour)));
	}
}
