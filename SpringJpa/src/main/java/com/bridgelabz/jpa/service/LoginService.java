package com.bridgelabz.jpa.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.jpa.dao.UserRepository;
import com.bridgelabz.jpa.models.Login;
import com.bridgelabz.jpa.models.UserInfo;

@Service
public class LoginService {

	@Autowired
	private UserRepository userRepo;
	
	public boolean authenticate(Login login)
	{
		
		List<UserInfo> users= (List<UserInfo>) userRepo.findAll();
		try {
		boolean flag= users.stream()
						   .filter(userInfo-> (userInfo.getUsername()
								   			   .equals(login.getUsername()) 
					 					       &&
					 					   userInfo.getPassword()
					 					   	   .equals(login.getPassword())))
						   .findAny()
						   .get()
						   .getFirstname()
						   .isEmpty();
		
		System.out.println(flag);
		return !flag;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
}
