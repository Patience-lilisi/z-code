package com.code.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.app.common.PageData;

@RestController
public class AppController {
	
	@RequestMapping(value="/gateway")
	public Object gateway(HttpServletRequest request) {
		return new PageData(request);
	}
}
