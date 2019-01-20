package com.api.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.api.models.Login;

//@Service
public interface LoginService {

	public boolean authenticateLogin(Login login);
	
}
