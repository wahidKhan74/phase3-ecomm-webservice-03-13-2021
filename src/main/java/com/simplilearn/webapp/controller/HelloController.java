package com.simplilearn.webapp.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String helloWord() {
		return "Hello to New Spring boot App !";
	}
	
	@RequestMapping("/hello")
	public String showMesage(@PathParam("name") String name) {
		return "Hello, Today is good Day! , " + name;
	}
	
	
	@RequestMapping("/hi/{id}")
	public String showMesage2(@PathVariable("id") String id) {
		return "Hi, Today is good Day! , " + id;
	}

}


//@RestController  = @Controller + @ResponseBody