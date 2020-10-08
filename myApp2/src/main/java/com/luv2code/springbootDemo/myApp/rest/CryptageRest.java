package com.luv2code.springbootDemo.myApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crypt")
public class CryptageRest {

	@GetMapping("/{message}")
	public String cryptMessage(@PathVariable String message) {

		
		return message;
		
	}
	
	
	
	
}
