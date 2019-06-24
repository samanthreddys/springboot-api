package com.myco.div.unit.restwebservices.helloworld;



import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

//Controller

@RestController

public class HelloWorldController {
	@Autowired
	private MessageSource messagesource;
	
	// create a method
	
	// GET Method
	// URI: /helloworld
	
	@GetMapping(path = "/helloworld")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/helloworldbean")
	public HelloWorldBean helloWorldBean() {
		//System.out.println("Request In:");
		return new HelloWorldBean("Hello Samanth");
	}
	
	// Pass name in the url path parameter
	
	@GetMapping(path = "/helloworldbean/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		//System.out.println("Request In:");
		return new HelloWorldBean(String.format("Hello %s !", name));
	}
	
	//Internationalization 


	@GetMapping(path = "/helloworld-in")
	public String helloworldIn18() {
		//System.out.println("Request In:");
		return messagesource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
	}

}
