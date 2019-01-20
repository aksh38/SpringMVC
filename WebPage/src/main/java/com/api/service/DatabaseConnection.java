package com.api.service;

import java.sql.*;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class DatabaseConnection {
	private static Connection con;
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "admin", "admin");
			return con;
		} catch (Exception e) {
			System.out.println("Connection failed.............!!!!");
			return null;
		}
		
	}

}
