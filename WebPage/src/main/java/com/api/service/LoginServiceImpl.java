package com.api.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import com.api.models.Login;

@Service
public class LoginServiceImpl implements LoginService{

	private Connection connect;
	private Statement statement;
	
	public LoginServiceImpl() throws Exception
	{
		connect= DatabaseConnection.getConnection();
		
	}
	
	public boolean authenticateLogin(Login login) {

		String sqlQuery=  "select * from Userdata where Username='"+login.getUserName()+"' "
				+ "and Password='"+login.getPassWord()+"'";
		try {
			statement= connect.createStatement();
			
			//System.out.println("hello i am stuck here....");
			
			statement.execute(sqlQuery);
			
			ResultSet resultSet=statement.getResultSet();
			
			if(resultSet.next())
			{
				return true;
			}
			else 
			{
				return false;
			}
		
			} catch (SQLException e) {
				
				System.out.println(" Login Failed.....!!!!! \n Connection Error.......!!!");
				return false;
			}
		
	}

	
	
}
