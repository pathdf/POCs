package com.pankaj.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pankaj.service.UserService;

@Controller
public class SecurityController {
	
	@Autowired
	private UserService userService;
	
	@PostConstruct
	public void postMethod()
	{
		System.out.println("hiiiiii");
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;

	}
	
	
	

}
