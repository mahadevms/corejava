package pack1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mahadev")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    public Save() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	 String name = request.getParameter("firstname");
	 String city = request.getParameter("city");
	 String email = request.getParameter("email");
	 String pincode = request.getParameter("pin");
	 String mobile = request.getParameter("mob");
	
	 
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_x", "root", "Maha@123");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"','"+pincode+"')");
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
	 
	}

}
