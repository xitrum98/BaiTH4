package com.example.controller;
import com.example.model.bean.UserBean;
import com.example.model.dao.UserDAO;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
		private static final long serialVersionUID= 1L;
	public LoginController() {
		super();
	}
	protected void doPost( HttpServletRequest request, HttpServletResponse response )
	throws ServletException ,IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserBean user = new UserBean();
		user.setUsername(username);
		user.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		boolean result = userDAO.CheckUser(user);
		
		if(result)
		{
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			
			
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
			
			rd.forward(request, response);
		}
		
	}
}
