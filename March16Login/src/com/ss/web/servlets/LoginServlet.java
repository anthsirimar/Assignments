package com.ss.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if(!UserDatabase.getLoginInfo().containsKey(username) ||
				!UserDatabase.getLoginInfo().get(username).equals(password)) {
			System.out.println(UserDatabase.getLoginInfo().toString());
			System.out.println(UserDatabase.getLoginInfo().get(username));
			System.out.println(password);
			writer.println("Username or password invalid "
					+ "<a href=\"index.html\">Return to login screen</a>");
		}
		else {
			writer.println("Hello " + username
					+ "<a href=\"index.html\"> Return to login screen</a>");
		}

	}

}
