package com.zomato.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zomato.model.DAOserviceImplClass;
import com.zomato.model.DAOserviceInterface;

@WebServlet("/registration")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("email")!=null) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pages/registration.jsp");
		rd.forward(request, response);
		}else {
			request.setAttribute("error", "logged out");
			RequestDispatcher rd = request.getRequestDispatcher("userLogin.jsp");
			rd.forward(request, response);
		}
		
		
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("email")!=null) {
			
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		DAOserviceInterface service=new DAOserviceImplClass();
		service.connectDB();
		service.saveReg(name,city,email,mobile);
		request.setAttribute("msg", "Registration saved Successfully");
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pages/registration.jsp");
		rd.forward(request, response);
	
		}else {
			request.setAttribute("error", "logged out");
			RequestDispatcher rd = request.getRequestDispatcher("userLogin.jsp");
			rd.forward(request, response);
		}
		
	}

}
