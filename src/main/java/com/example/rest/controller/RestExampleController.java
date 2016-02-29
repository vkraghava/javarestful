package com.example.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.dto.Greetings;


@RestController
public class RestExampleController {

	@RequestMapping("/greeting")
	public Greetings greeting(@RequestParam(defaultValue="World",required=false,value="name") String name){
		
		return new Greetings(1+"","Greetings " + name);
		
	}
	
	
}
