package com.code.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Ribbon {
	public static void main(String[] args) {
		SpringApplication.run(Ribbon.class, args);
	}
	
	@RequestMapping(value="/")
	public Object ribbon() {
		return "ribbon";
	}
}
