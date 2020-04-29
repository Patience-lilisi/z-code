package com.code.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.app.common.PageData;

@SpringBootApplication
@RestController
public class Controllers {
	public static void main(String[] args) {
		SpringApplication.run(Controllers.class, args);
	}
	
	@RequestMapping(value="/controllers")
	public Object controllers(HttpServletRequest request) {
		PageData pd = new PageData(request);
		return pd;
	}
}
