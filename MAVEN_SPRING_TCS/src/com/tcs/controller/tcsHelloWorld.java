package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
public class tcsHelloWorld {
	 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, TCS MVC Tutorial</h3>This message is coming from tcsHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}