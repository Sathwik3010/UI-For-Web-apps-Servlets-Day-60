package com.codegnan.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("uname");
		String password = request.getParameter("upwd");
		
        out.println("<html><body style='font-family:Arial'>");
		if(username.equals("Dev") && password.equals("Dev@23")) {
			out.println("<h2 style='color:green'>Login Successful</h2>");
			out.println("<p>Welcome "+username+"</p>");
		} else {
			out.println("<h2 style='color:red'>Login Failed</h2>");
			out.println("<p>Invalid username or password</p>");
		}
		
		out.println("<h3 align = 'center'>");
		out.println("<a href='.Login.html'>|Login Form|</a>");
		out.println("</h3>");
		out.println("</body></html>");
		out.close();
	}

}
