package com.app.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import com.app.login.*;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DBLogin login;
	
	public void init() {
		login = new DBLogin();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String useremail = request.getParameter("userEmailID");
		String password = request.getParameter("userPassword");
		UserProfile user = new UserProfile();
		user.setPassword(password);
		user.setUseremail(useremail);
		
		try {
			if(login.verifyUser(user)) {
				if(request.getParameter("rememberMe") != null) {
					Cookie cUserName = new Cookie("cookuser", user.getUsername());
					Cookie cPassword = new Cookie("cookpass", user.getPassword());

					cUserName.setMaxAge(60 * 60 * 24 * 3);// 3 days
					cPassword.setMaxAge(60 * 60 * 24 * 3);
					response.addCookie(cUserName);
					response.addCookie(cPassword);
				}
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("sessionUser1", login.getUserName());
				
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
				requestDispatcher.forward(request, response);
				
//				response.sendRedirect("home.jsp");
			}
			else {
				System.out.println("Authentication failure.");
				request.setAttribute("msg", "Authentication failure.");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
				requestDispatcher.forward(request, response);
//				response.sendRedirect("login.jsp");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}

}
