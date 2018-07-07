package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = { "/un-secure" })
	public String helloWorld(HttpServletRequest request, HttpServletResponse response) {
		return "un-secure World";
	}

	@RequestMapping(value = { "/secure" })
	public String secure(HttpServletRequest request, HttpServletResponse response) {
		return "secure url";
	}

	@RequestMapping(value = { "/admin" })
	public String admin(HttpServletRequest request, HttpServletResponse response) {
		return "admin url";
	}
}
