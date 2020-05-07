package com.code.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@RestController
public class SentinelApp {
	public static void main(String[] args) {
		SpringApplication.run(SentinelApp.class, args);
	}
	
	@RequestMapping(value="/")
	public Object title() {
		return "sentinel";
	}
}
