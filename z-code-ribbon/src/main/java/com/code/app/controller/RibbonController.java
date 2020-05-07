package com.code.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/ribbon")
	public Object ribbon(HttpServletRequest request) {
		return restTemplate.getForObject("http://nacos-config",String.class);
	}
	
	@RequestMapping(value="/excs")
	public Object excs() {
		return 1/0;
	}
}
