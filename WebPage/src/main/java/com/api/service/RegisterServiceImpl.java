package com.api.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.api.models.Login;
import com.api.models.UserInfo;

@Service
public class RegisterServiceImpl implements RegisterService{

	private Connection connect;
	private Statement statement;
	
	public RegisterServiceImpl()
	{
		connect= DatabaseConnection.getConnection();
		
	}
	
	public boolean registerUser(UserInfo user) {

		try {
			if(user.getPassWord().equals(user.getPassWord2()))
			{
				statement=connect.createStatement();
				String sqlQuery= "Insert into "
							   + "Userdata(FirstName, LastName, MobileNo, EmailId, UserName, Password)"
							   + "values('"+user.getFirstName()+"','"
							   			   +user.getLastName()+"','"
							   			   +user.getMobileNum()+"','"
							   			   +user.getEmail()+"','"
							   			   +user.getUserName()+"','"
							   			   +user.getPassWord()+"')";
				
				statement.execute(sqlQuery);
				System.out.println("Successfully added new user "+user.getUserName());
				
				return true;
			}
			else
			{
				return false;
			}
		} catch (SQLException e) {
			
			System.out.println("\n Registtation failed........!!!\n Connection failed ..........!!");
			return false;
		}
		
	}

	public boolean removeUser(Login login) {
		
		return false;
	}

	
	
}
