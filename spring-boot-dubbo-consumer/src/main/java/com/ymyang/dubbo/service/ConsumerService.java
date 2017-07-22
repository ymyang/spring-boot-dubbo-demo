package com.ymyang.dubbo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@Autowired
	private HelloService helloService;
	
	public String hello(String name) {
		return helloService.hello(name);
	}
}
