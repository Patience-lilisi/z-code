package com.code.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApp {
	
	@Value("${server.port}")
	private String port;
	
	public static void main(String[] args) {
		SpringApplication.run(FeignApp.class, args);
	}
	
	@RequestMapping(value="/")
	public Object feign(HttpServletRequest request) {
		return port;
//		return "12312312";
	}
}
