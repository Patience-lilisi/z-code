package com.code.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.app.service.SenitelServices;
import com.code.app.feignService.SentinelService;

@RestController
public class SentinelController {
	
	@Autowired
	private SenitelServices services;//两个
	
	@Autowired
	private SentinelService service;//单个
	
	@RequestMapping(value="/get")
	public Object get() {
		return service.getPort();
	}
}
