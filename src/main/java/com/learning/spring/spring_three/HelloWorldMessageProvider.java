package com.learning.spring.spring_three;

import org.springframework.stereotype.Component;

import com.learning.spring.spring_three._interface.MessageProvider;

@Component("Provider")
public class HelloWorldMessageProvider implements MessageProvider
{

	public String getMessage() {
		return "Hello World - Spring Annotation Bro !";
	}
    
}
