package com.code.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosApp {
	public static void main(String[] args) {
		SpringApplication.run(NacosApp.class, args);
	}
	
	@RequestMapping(value="/nacos")
	public Object nacos(HttpServletRequest request) {
		return "nacos";
	}
}
