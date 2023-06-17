package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
//	@RequestMapping("home")
//	public String home(@RequestParam("name")String myName, HttpSession session) {
//		System.out.println("Hi : "+ myName);
//		
//		session.setAttribute("name", myName);
//		
//		return "home.jsp";
//	}
	
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("aname")String myName) {
//		
//		ModelAndView mv = new ModelAndView();
//		System.out.println("Hi : "+ myName);	
//		mv.setViewName("home.jsp");
//		mv.addObject("name", myName);
//		return mv;
//	}
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		
		ModelAndView mv = new ModelAndView();
		System.out.println("Hi : "+ alien.getAname());
		mv.setViewName("home.jsp");
		mv.addObject("obj", alien);
		return mv;
	}

	// http://localhost:8080/home?aid=1&aname=Jakab&lang=Java
	// Output - WELCOME 1 , Jakab , Java
	
}
