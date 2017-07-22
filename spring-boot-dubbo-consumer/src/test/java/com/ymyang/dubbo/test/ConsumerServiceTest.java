package com.ymyang.dubbo.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ymyang.dubbo.service.ConsumerService;

public class ConsumerServiceTest extends BaseTest {

	@Autowired
	private ConsumerService consumerService;
	
	@Test
	public void hello() {
		String str = consumerService.hello("Dubbo");
		System.out.println(str);
	}
}
