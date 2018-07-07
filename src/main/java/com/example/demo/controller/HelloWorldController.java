package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = { "/un-secure" })
	public String helloWorld(HttpServletRequest request, HttpServletResponse response) {
		return "Hello World";
	}

	@RequestMapping(value = { "/secure" })
	public String demo(HttpServletRequest request, HttpServletResponse response) {
		return "secure url";
	}
}
