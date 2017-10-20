package servlets.cookies;

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

@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Cookie[] _c = req.getCookies() == null ? new Cookie[] {} : req.getCookies();
		Map<String, Cookie> cookies = Arrays.asList(_c).stream()
				.collect(Collectors.toMap(Cookie::getName, Function.identity()));

		if (!cookies.containsKey("USER_NAME")) {
			String name = req.getParameter("userName");

			if (name == null || (name != null && name.matches("[ \\t\\n]*"))) {
				res.sendRedirect("/servlets/12");
				return;
			} else {
				Cookie user = new Cookie("USER_NAME", name.trim());
				user.setMaxAge(30);
				res.addCookie(user);
			}
		}
		res.sendRedirect("/servlets/user");
	}
}
