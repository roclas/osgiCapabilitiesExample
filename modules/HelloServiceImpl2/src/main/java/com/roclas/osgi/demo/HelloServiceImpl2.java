package com.roclas.osgi.demo;

import helloservice.api.HelloService;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
			"implementation=impl2"
	},
	service = HelloService.class
)
public class HelloServiceImpl2 implements HelloService {
	@Override
	public String sayHello() {
		return "Hello, I'm using HelloServiceImpl2";
	}

}