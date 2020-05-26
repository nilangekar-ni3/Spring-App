package com.springapp.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController implements ErrorController {

	@RequestMapping("/greeting")
	public String greeting() {
		System.out.println("greeting execute");
		return "welcome";
	}
	
	private final static String PATH = "/error";
    @Override
    @RequestMapping(PATH)
    @ResponseBody
    public String getErrorPath() {
        // TODO Auto-generated method stub
        return "No Mapping Found";
    }
	
}
