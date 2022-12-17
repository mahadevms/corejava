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

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	HttpSession session = request.getSession(true);
	session.setAttribute("email", email);
	DAOserviceInterface service=new DAOserviceImplClass();
	service.connectDB();
	boolean status = service.verifyUser(email,password);
	if (status==true) {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/registration.jsp");
		rd.forward(request, response);
	} else {
		request.setAttribute("error", "invalid userName/password");
		RequestDispatcher rd = request.getRequestDispatcher("userLogin.jsp");
		rd.forward(request, response);
	}
	}

}
