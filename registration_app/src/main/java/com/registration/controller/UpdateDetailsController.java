package com.registration.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.registration.model.DAOService;
import com.registration.model.DAOServiceImpl;

@WebServlet("/update")
public class UpdateDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateDetailsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("emailid");
		String mobile = request.getParameter("mobile");
		request.setAttribute("email", email);
		request.setAttribute("mobile", mobile);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/updateMobile.jsp");
		rd.forward(request, response);
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		HttpSession session = request.getSession(false);
		if (session.getAttribute("email")!=null) {
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			DAOService service= new DAOServiceImpl();
			service.connectDB();
			service.updateMobile(email,mobile);
			ResultSet result = service.listAllRegistration();
			request.setAttribute("result", result);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list_registration.jsp");
			rd.forward(request, response);
			
		} else {
			request.setAttribute("error", "Logged Out");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		
	}

}
