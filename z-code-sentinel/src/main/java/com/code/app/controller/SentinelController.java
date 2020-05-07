package com.code.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.app.service.SentinelService;

@RestController
public class SentinelController {

	@Autowired
	private SentinelService service;
	
	@RequestMapping(value="/sentinel")
	public Object sentinel() {
		return service.getPort();
	}
}
