package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/simpleMessage")
	public String simpleMessage() {
		return "Welcome to Google App Engine";
	}
}
