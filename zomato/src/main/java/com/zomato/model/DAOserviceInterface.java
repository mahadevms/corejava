package com.zomato.model;

import java.sql.ResultSet;

public interface DAOserviceInterface {

	public void connectDB();

	public boolean verifyUser(String email, String password);

	public void saveReg(String name, String city, String email, String mobile);

	public ResultSet readList();

	public void deleteReg(String email);

	public void updateMobile(String mobile, String email);

}
