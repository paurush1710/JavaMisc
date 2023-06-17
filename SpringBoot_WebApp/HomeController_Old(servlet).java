package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	 
//	@RequestMapping("home")
//	@ResponseBody 
//	(Says whatever you are returning is data, not page)
	
//	public String home() {
//		System.out.println("Hi, Home fn");
////		return "home.jsp";
//		return "home";
//	}

	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		String name = req.getParameter("name");
		System.out.println("Hi : "+ name);
		
// Now to send data to home.jsp we can use same req object or we can use Session	
		
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		
// Now how to fetch in home.jsp
// Add this is home.jsp -> ${name}		
		
		session.setAttribute(name, name);
		return "home.jsp";
	}
// If there is no change in url : http://localhost:8080/home?name=john
// after running it, then spring is using RequestDispatcher to call home.jsp
// It means they will be using the same req (Request Object)	
	
}
