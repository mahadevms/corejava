package package1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/firstServlet")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public First() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String name = request.getParameter("name");
	request.setAttribute("name1", name);
	
	HttpSession session = request.getSession(true);
	session.setAttribute("sessionName", name);
	
	RequestDispatcher rd = request.getRequestDispatcher("secondServlets");
	rd.forward(request, response);
	
	
	
	}

}
