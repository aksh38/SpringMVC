package com.api.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.api.models.UserInfo;
import com.api.service.RegisterService;
import com.api.service.RegisterServiceImpl;

@Controller
public class RegisterController 
{
	@Autowired
	private RegisterService newRegister;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView showRegister()
	{
		return new ModelAndView("myRegisterPage");
	}
	
	@RequestMapping(value="/registerProcess", method=RequestMethod.POST)
	public ModelAndView makeRegister(@ModelAttribute UserInfo user)
	{
		newRegister.registerUser(user);
		return new ModelAndView("registerSuccessor");
	}
	
}
