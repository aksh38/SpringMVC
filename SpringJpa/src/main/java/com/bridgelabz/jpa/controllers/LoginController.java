package com.bridgelabz.jpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.jpa.models.Login;
import com.bridgelabz.jpa.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public ModelAndView getLogin()
	{
		return new ModelAndView("login");
	}
	
	@RequestMapping("/processLogin")
	public ModelAndView processLogin(@ModelAttribute Login login)
	{
		System.out.println(""+login.getUsername());
		boolean result=loginService.authenticate(login);
		
		if(result)
		{
			return new ModelAndView("loginSuccess", "login", login);
			
			
		}
		else
		{
			return new ModelAndView("loginFailed");
		}		
	}
}
