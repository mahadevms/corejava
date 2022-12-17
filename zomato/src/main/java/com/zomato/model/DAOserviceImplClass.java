package com.zomato.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOserviceImplClass implements DAOserviceInterface {
Connection con;
Statement stmt;
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","Maha@123");
			stmt=con.createStatement();
		} catch (Exception e) {
			
		}
	}
	@Override
	public  boolean verifyUser(String email, String password) {
		try {
			ResultSet result = stmt.executeQuery("select * from login3 where email='"+email+"' and password='"+password+"'");
			return result.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public void saveReg(String name, String city, String email, String mobile) {
		try {
			stmt.executeUpdate("insert into clients values ('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public ResultSet readList() {
		try {
			ResultSet result = stmt.executeQuery("select * from clients");
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return null;
	}
	@Override
	public void deleteReg(String email) {
		try {
			stmt.executeUpdate("delete from clients where email='"+email+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	@Override
	public void updateMobile(String mobile, String email) {
		try {
			stmt.executeUpdate("update clients set mobile='"+mobile+"' where email='"+email+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
