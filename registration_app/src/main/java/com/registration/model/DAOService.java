package com.registration.model;

import java.sql.ResultSet;

public interface DAOService {
public void connectDB();
public boolean verifyCredentials(String email,String password);
public void saveRegistration(String name,String city,String email,String mobile);
public ResultSet listAllRegistration();
public void deleteRecord(String email);
public void updateMobile(String email, String mobile);

}
