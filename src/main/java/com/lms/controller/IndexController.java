package com.lms.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lms.model.Employee;

@Controller
public class IndexController {

	@RequestMapping(value="/")
    public ModelAndView index(ModelAndView modelandview, HttpServletRequest request, HttpServletResponse resp){
       
		 modelandview = new ModelAndView("login", "logincommand", new Employee());
		// modelandview.setViewName("login");
		 System.out.println("========================>");
        return modelandview;
    }
	
	@RequestMapping("/next")
	public String next(Map<String, Object> model) {
		model.put("message", "You are in new page !!");
		return "next";
	}

}