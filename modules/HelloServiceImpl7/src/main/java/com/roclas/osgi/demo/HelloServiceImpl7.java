package com.roclas.osgi.demo;

import helloservice.api.HelloService;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = HelloService.class
)
public class HelloServiceImpl7 implements HelloService {

	@Override
	public String sayHello() {
		return "Hello, I'm using HelloServiceImpl7";
	}


}