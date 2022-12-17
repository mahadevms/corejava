package com.registration.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	Connection con;
	Statement stmt;
	
	@Override
	public void connectDB() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root","Maha@123");
		 stmt=con.createStatement();
		 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean verifyCredentials(String email, String password) {
		try {
			
			ResultSet result = stmt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
		return result.next();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public void saveRegistration(String name, String city, String email, String mobile) {
		try {
			stmt.executeUpdate("insert into save values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet listAllRegistration() {
		try {
			ResultSet result = stmt.executeQuery("select * from save ");
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteRecord(String email) {
		try {
			stmt.executeUpdate("delete from save where email='"+email+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateMobile(String email, String mobile) {
		try {
			stmt.executeUpdate("update save set mobile='"+mobile+"' where email='"+email+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
