package com.zomato.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zomato.model.DAOserviceImplClass;
import com.zomato.model.DAOserviceInterface;
@WebServlet("/readRegistration")
public class ReadRegDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReadRegDetailsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("email")!=null) {
			DAOserviceInterface service=new DAOserviceImplClass();
		service.connectDB();
		ResultSet list = service.readList();
		request.setAttribute("result", list);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pages/readList.jsp");
		rd.forward(request, response);
		}else {
			request.setAttribute("error", "logged out");
			RequestDispatcher rd = request.getRequestDispatcher("userLogin.jsp");
			rd.forward(request, response);
		}
		
		
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
