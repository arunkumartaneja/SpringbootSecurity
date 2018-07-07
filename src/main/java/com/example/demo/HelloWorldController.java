package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = { "/" })
	public String helloWorld(HttpServletRequest request, HttpServletResponse response) {
		return "Hello World";
	}

	// @RequestMapping(value = { "", "/" })
	// public String demo(HttpServletRequest request, HttpServletResponse
	// response) {
	// System.out.println("### Demo Controller ###");
	//
	// Post post = new Post();
	//
	// return "demo controller post -- " + post.toString();
	// }
}
