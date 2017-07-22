package com.ymyang.dubbo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		try {
			System.in.read();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
