package com.code.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
//@EnableAutoDataSourceProxy
public class Provide01 {
	public static void main(String[] args) {
		SpringApplication.run(Provide01.class, args);
	}
	
	@RequestMapping(value="/")
	public Object seata() {
		return "provide01";
	}
}
