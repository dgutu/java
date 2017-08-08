package com.searchincite.server.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		System.out.println(req.getRemoteHost() + " tried to access "
				+ req.getRequestURL() + ".");

		HttpServletResponse resp = (HttpServletResponse) response;

		// DON'T TRY THIS! The page will continuously refresh!
		//resp.sendRedirect("AccessDenied.html"); 

		//PrintWriter s = resp.getWriter();

		if (req.getSession() == null) {
			//s.write("Invalid Session -- Access denied.");
		} else {
			//s.write("session is NOT null<br>");

			//HttpSession session = req.getSession();

			//if (!req.getRequestURI().contains("SearchIncite.html")) {
			//resp.getWriter().write(req.getRequestURI());
			//s.write(req.getReader().read());
			//s.write(session.getId());
			//session.setAttribute("auth", new Integer(0));
			//}
			//else {
			//	chain.doFilter(request,response);  
			//}
		}

		if (req.getRequestURI().indexOf("SearchIncite.html") != -1
				|| req.getRequestURI().indexOf("/auth") != -1) {
			chain.doFilter(request, response);
			return;
		}

		if (((Integer) req.getSession().getAttribute("logged-in"))
				.equals(new Integer(0))) {
			resp.getWriter().write("Access denied");
		}

		//resp.addCookie(new Cookie("test-cookie", req.getRequestURI()));
		// Call this to permit response.
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
