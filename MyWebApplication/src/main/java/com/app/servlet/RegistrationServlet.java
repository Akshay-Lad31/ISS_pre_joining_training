package com.app.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.app.login.DBLogin;
import com.app.login.UserProfile;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DBLogin login;
	
	public void init() {
		login = new DBLogin();
	
	}  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("registration.jsp");
		requestDispatcher.forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("userName");
		String useremail = request.getParameter("userEmailID");
		String password = request.getParameter("userPassword");
		String confirmPassword = request.getParameter("confirmPassword");
		UserProfile user = new UserProfile();
		user.setUsername(username);
		user.setPassword(password);
		user.setUseremail(useremail);
		
		try {
			if(login.addUser(user)) {
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("RegistrationSuccess", "User " + login.getUserName() + "Added Successfully");
				
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("regSucess.jsp");
				requestDispatcher.forward(request, response);
				
//				response.sendRedirect("home.jsp");
			}
			else {
				System.out.println("Authentication failure.");
				request.setAttribute("msg", "Authentication failure.Couldn't register new user.");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("registration.jsp");
				requestDispatcher.forward(request, response);
//				response.sendRedirect("login.jsp");
			}
		}
		catch(Exception e) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("errorMessage", e);
			e.printStackTrace();
		}
		
	}

}
