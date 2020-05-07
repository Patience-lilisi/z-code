package com.code.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.app.service.FeignService;

@RestController
public class FeignController {

	@Autowired
	private FeignService service;
	
	@RequestMapping(value="/hello")
	public Object hello() {
		return service.getPort();
	}
}
