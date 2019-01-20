package com.bridgelabz.jpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.jpa.dao.UserRepository;
import com.bridgelabz.jpa.models.UserInfo;

@Controller
public class RegisterController {

	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/register")
	public ModelAndView getRegisterPage()
	{
		return new ModelAndView("register");
	}
	
	@RequestMapping("/processRegister")
	public ModelAndView processRegister(UserInfo user)
	{
		userRepo.save(user);
		
		return new ModelAndView("register");
	}
}
