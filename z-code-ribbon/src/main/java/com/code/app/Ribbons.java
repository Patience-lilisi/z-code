package com.code.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Ribbons {
	
	//注入resttemplate实例
	@Bean
	@LoadBalanced //开启负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ribbons.class, args);
	}
	
	@RequestMapping(value="/")
	public Object ribbon() {
		return "ribbon";
	}
}
