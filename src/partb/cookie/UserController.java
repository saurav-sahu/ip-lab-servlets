package partb.cookie;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/user")
public class UserController extends HttpServlet {

	private static final long serialVersionUID = -1869005753410250996L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Map<String, Cookie> cookies = Arrays
				.asList(req.getCookies())
				.stream()
				.collect(Collectors.toMap(Cookie::getName, Function.identity()));
		
		if(cookies.containsKey("USERNAME"))
			res.getWriter().println("Welcome back, "+ cookies.get("USERNAME")+ ".");
		else res.addHeader("Location", req.getServerName()+ "/ip/12/login.html");
	}
}
