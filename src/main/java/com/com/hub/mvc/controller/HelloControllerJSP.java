package com.com.hub.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/java")
public class HelloControllerJSP {

	@RequestMapping("/hello")
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "JAVA");
		return "hello";

	}
	
}