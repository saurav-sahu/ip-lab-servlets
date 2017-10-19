package partb;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.TimeHelper;

import java.util.Calendar;
import java.text.SimpleDateFormat;

@WebServlet({"/api/time", "/11"})
public class TimeController extends HttpServlet{

	String format = "<html><head><title>Greeting based on Time</title></head><body><h1>%s</h1></body></html>";
	
	private static final long serialVersionUID = 1910745864444025906L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int hour = Integer.parseInt(new SimpleDateFormat("HH").format(Calendar.getInstance().getTime()));
		res.getWriter().println(String.format(format, TimeHelper.getMessageBasedOnHour(hour)));
	}
}
