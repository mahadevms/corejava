package com.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.registration.model.DAOService;
import com.registration.model.DAOServiceImpl;


@WebServlet("/saveRegistration")
public class SaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SaveController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Registration.jsp");
		rd.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("email")!=null) {
				
	String name = request.getParameter("name");
	String city = request.getParameter("city");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	
	DAOService service= new DAOServiceImpl();
	service.connectDB();
	
	service.saveRegistration(name, city, email, mobile);
	
	request.setAttribute("msg", "data saved successfully");
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Registration.jsp");
	rd.forward(request, response);
		} else {
			request.setAttribute("error", "Logged Out");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		
		}
		

	
	
	
	}

}
