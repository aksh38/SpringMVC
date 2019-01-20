package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("hello")
	public String showHello(HttpServletRequest req)
	{
		HttpSession session= req.getSession();
		System.out.println("Hello my app is running");
		
		session.setAttribute("name", "Khan");
		return "hello";
	}

}
