package com.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.api.models.Login;
import com.api.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView getLoginPage()
	{
		return new ModelAndView("myLoginPage");
	}
	
	@RequestMapping(value="/loginProcess", method=RequestMethod.GET) 
	public ModelAndView processLogin(@ModelAttribute Login login) 
	{
	
		boolean result=loginService.authenticateLogin(login);
		
		if(result)
		{
			return new ModelAndView("welcome");
		}
		else
		{
			return new ModelAndView("loginFailure");
		}
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public ModelAndView getHomePage()
	{
		return new ModelAndView("index");
	}
	
}
