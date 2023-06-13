package com.paurush;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.paurush.service.AddService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AddController {
	
//  1. Output on IDE Console	
//	@RequestMapping(value = "/add", method=RequestMethod.GET)
//	public void add() {
//		System.out.println("I'm in Add Controller");
//	}

//  2. Output on web page
//	@RequestMapping(value = "/add", method=RequestMethod.GET)
//	public String add() {
//		return "display.jsp";
//	}
	
//  3. Output on web page with data & operation performed
//	@RequestMapping(value = "/add", method=RequestMethod.GET)
//	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
//		
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
//
//		AddService as = new AddService();
//		int k=as.add(i, j);
//		
//		ModelAndView mv = new ModelAndView();
////		mv.setViewName("display.jsp");
//		mv.setViewName("display");
//		mv.addObject("result", k);
//		
//		return mv;
//	}

//	4. Replacing HttpServletRequest with @RequestParam to directly take values from URL
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
		
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));

		AddService as = new AddService();
		int k=as.add(i, j);
		
		ModelAndView mv = new ModelAndView();
//		mv.setViewName("display.jsp");
		mv.setViewName("display");
		mv.addObject("result", k);
		
		return mv;
	}
	
}
