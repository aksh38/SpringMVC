package com.api.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.api.models.Login;
import com.api.models.UserInfo;

@Service

public interface RegisterService {

	public boolean registerUser(UserInfo user);
	public boolean removeUser(Login login);
}
