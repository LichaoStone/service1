package com.allook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableEurekaClient
public class Service1Application {
//	private static final DynamicPropertyFactory configInstance = com.netflix.config.DynamicPropertyFactory
//            .getInstance();
	
	@RequestMapping("/")
	public String home() {
		return "Hello!  I am Service1... ...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
}
