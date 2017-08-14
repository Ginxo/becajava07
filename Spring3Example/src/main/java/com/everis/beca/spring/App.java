package com.everis.beca.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
	  ApplicationContext context = new AnnotationConfigApplicationContext("com.everis.beca.spring");
	  
	  ((UserService)context.getBean("userService")).getUsers();

	  
	}
}
