package com.pankaj.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@PostConstruct
	public void init(){
		System.out.println("loaded");
	}
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld()
	{
		String message="Hello World";
		return new ModelAndView("showMessage","message",message);
	}
	
}
