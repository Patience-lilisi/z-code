package com.code.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class Provide02 {
	public static void main(String[] args) {
		SpringApplication.run(Provide02.class, args);
	}
	
	@RequestMapping(value="/")
	public Object seata() {
		return "provide02";
	}
}
